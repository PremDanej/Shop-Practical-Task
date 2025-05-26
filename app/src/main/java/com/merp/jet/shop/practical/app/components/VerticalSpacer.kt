package com.merp.jet.shop.practical.app.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun VerticalSpacer(size: Int = 10) {
    Spacer(
        modifier = Modifier
            .fillMaxWidth()
            .height(size.dp)
    )
}