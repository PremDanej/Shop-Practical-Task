package com.merp.jet.shop.practical.app.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merp.jet.shop.practical.app.PADDING_10
import com.merp.jet.shop.practical.app.R

@Composable
fun CategoryBox(category: String) {
    Box(modifier = Modifier.height(110.dp)) {
        Box(
            modifier = Modifier
                .padding(PADDING_10 - 2.dp)
                .size(80.dp)
                .clip(CircleShape)
                .background(Color.Black)
        ) {
            Image(
                modifier = Modifier.align(Alignment.Center),
                painter = painterResource(id = R.drawable.product_image),
                contentDescription = "Image"
            )
        }
        Text(
            text = category,
            fontSize = 13.sp,
            modifier = Modifier.align(Alignment.BottomCenter),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )
    }
}