package com.merp.jet.shop.practical.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import com.merp.jet.shop.practical.app.components.CategoryBox
import com.merp.jet.shop.practical.app.components.OfferCard
import com.merp.jet.shop.practical.app.components.ProductCard
import com.merp.jet.shop.practical.app.components.TopActionBar
import com.merp.jet.shop.practical.app.components.VerticalSpacer
import com.merp.jet.shop.practical.app.model.Product
import com.merp.jet.shop.practical.app.ui.theme.CenturyFont
import com.merp.jet.shop.practical.app.ui.theme.ShopTheme

val PADDING_10 = 10.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ShopTheme {
                Scaffold(
                    topBar = { TopActionBar() },
                    modifier = Modifier.fillMaxSize(),
                ) { innerPadding ->
                    Surface(Modifier.padding(innerPadding)) {
                        ScreenContent()
                    }
                }
            }
        }
    }
}

@Composable
fun ScreenContent() {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        VerticalSpacer()
        OfferCard()
        VerticalSpacer()
        MainHeader(title = "Categories")
        CategoryList()
        VerticalSpacer()
        MainHeader(title = "New products")
        VerticalSpacer(16)
        NewProducts()
    }
}

@Composable
fun MainHeader(title: String) {
    Row(
        Modifier
            .fillMaxWidth()
            .padding(horizontal = PADDING_10),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = title,
            fontFamily = FontFamily(CenturyFont),
            style = MaterialTheme.typography.titleLarge
        )
        Text(text = "See all", textDecoration = TextDecoration.Underline)
    }
}

@Composable
fun CategoryList() {
    val categories =
        listOf("Cleaners", "Toner", "Serums", "Moisturiser", "SunsCream", "Lotions", "MoonCream")

    LazyRow {
        items(categories.size) { index ->
            CategoryBox(categories[index])
        }
    }
}

@Composable
fun NewProducts() {
    val products = listOf(
        Product(name = "clencera", isLiked = true, isBest = true, inStock = true),
        Product(name = "glow"),
        Product(name = "afterglow", inStock = false),
        Product(name = "glow", isLiked = true, isBest = true, inStock = true),
        Product(name = "clencera"),
        Product(name = "afterglow", inStock = false)
    )

    repeat(products.size) { index ->
        ProductCard(products[index])
        VerticalSpacer(size = 16)
    }
}