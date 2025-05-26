package com.merp.jet.shop.practical.app.components

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.FavoriteBorder
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.merp.jet.shop.practical.app.R
import com.merp.jet.shop.practical.app.ui.theme.CenturyFont

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopActionBar() {
    val sizeModifier = Modifier.size(40.dp)
    val offSetModifier = Modifier.offset(0.dp, 20.dp) //.size(35.dp)
    TopAppBar(
        title = {
            Text(
                text = stringResource(id = R.string.app_name),
                fontFamily = FontFamily(CenturyFont)
            )
        },
        navigationIcon = {
            IconButton(onClick = { }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.ArrowBack,
                    contentDescription = "Navigate Up"
                )
            }
        },
        actions = {
            IconButton(
                onClick = { },
                modifier = sizeModifier
            ) {
                Icon(imageVector = Icons.Default.Search, contentDescription = "Search")
            }
            BadgedBox(badge = {
                Badge(
                    modifier = offSetModifier,
                    containerColor = Color.Green
                ) {
                    Text(text = "3", color = MaterialTheme.colorScheme.background)
                }
            }) {
                IconButton(
                    onClick = { },
                    modifier = sizeModifier
                ) {
                    Icon(imageVector = Icons.Outlined.FavoriteBorder, contentDescription = "Search")
                }
            }
            BadgedBox(badge = {
                Badge(
                    modifier = offSetModifier,
                    containerColor = Color.Green
                ) {
                    Text(text = "3", color = MaterialTheme.colorScheme.background)
                }
            }) {
                IconButton(
                    onClick = { },
                    modifier = sizeModifier
                ) {
                    Icon(imageVector = Icons.Outlined.ShoppingCart, contentDescription = "Search")
                }
            }
        }

    )
}