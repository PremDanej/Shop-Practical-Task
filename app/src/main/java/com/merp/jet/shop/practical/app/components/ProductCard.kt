package com.merp.jet.shop.practical.app.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merp.jet.shop.practical.app.R
import com.merp.jet.shop.practical.app.model.Product
import com.merp.jet.shop.practical.app.ui.theme.PrimaryColor
import com.merp.jet.shop.practical.app.ui.theme.SecondaryColor
import com.merp.jet.shop.practical.app.ui.theme.TangerineFont

@Composable
fun ProductCard(product: Product) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(550.dp)
    ) {
        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.card_grey_bg),
            contentDescription = "",
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, top = 5.dp, end = 30.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                IconButton(
                    onClick = {},
                    colors = IconButtonDefaults.outlinedIconButtonColors(
                        containerColor = Color.Black,
                        contentColor = SecondaryColor,
                    )
                ) {
                    if (product.isLiked) {
                        Icon(imageVector = Icons.Default.Favorite, contentDescription = "")
                    } else {
                        Icon(imageVector = Icons.Default.FavoriteBorder, contentDescription = "")
                    }
                }
                if (product.isBest) {
                    BadgedBox(badge = {}) {
                        Badge(
                            containerColor = Color.Black,
                            contentColor = PrimaryColor
                        ) {
                            Text(
                                text = "Best seller",
                                modifier = Modifier.padding(6.dp),
                                fontWeight = FontWeight.Bold
                            )
                        }
                    }
                }
            }

            // Image
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(270.dp)
            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.product_image),
                    contentDescription = "product ",
                    contentScale = ContentScale.Fit
                )
            }


            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .padding(20.dp)
            ) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.card_black_shape),
                    contentDescription = "product ",
                    contentScale = ContentScale.FillBounds
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = product.name,
                            fontFamily = FontFamily(TangerineFont),
                            color = PrimaryColor,
                            fontSize = 22.sp
                        )
                        if (product.inStock) Text(text = "• In stock", color = PrimaryColor)
                        else Text(text = "• Out of stock", color = Color.Red)

                    }
                    VerticalSpacer(size = 5)
                    Text(
                        "French clay and algae-powered cleanser",
                        color = Color.White.copy(alpha = 800f),
                        maxLines = 1,
                        overflow = TextOverflow.Ellipsis
                    )
                    VerticalSpacer(size = 4)
                    Text(
                        "Skin Tightness • Dry & Dehydrated Skin",
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )
                    VerticalSpacer(size = 10)
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            text = "RS. 355.20",
                            fontWeight = FontWeight.Bold,
                            color = SecondaryColor
                        )
                        Text(
                            text = "RS. 444.00",
                            textDecoration = TextDecoration.LineThrough,
                            color = Color.DarkGray,
                            modifier = Modifier.padding(start = 5.dp)
                        )
                    }
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        repeat(5) {
                            Icon(Icons.Filled.Star, contentDescription = null, tint = Color.Yellow)
                        }
                        Text(
                            text = "249 reviews",
                            textDecoration = TextDecoration.Underline,
                            modifier = Modifier.padding(start = 5.dp)
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .size(60.dp)
                        .clip(CircleShape)
                        .align(Alignment.BottomEnd)
                        .border(1.dp, PrimaryColor, CircleShape),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        modifier = Modifier
                            .size(20.dp),
                        painter = painterResource(id = R.drawable.cart),
                        contentDescription = "card",
                        contentScale = ContentScale.FillWidth
                    )
                }
            }
        }
    }
}