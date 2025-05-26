package com.merp.jet.shop.practical.app.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merp.jet.shop.practical.app.R
import com.merp.jet.shop.practical.app.ui.theme.PrimaryColor

@Composable
fun OfferCard() {
    val pagerState = rememberPagerState(pageCount = {
        3
    })

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        HorizontalPager(
            state = pagerState,
            modifier = Modifier.fillMaxSize()
        ) {
            Box(modifier = Modifier.fillMaxSize()) {
                Image(
                    modifier = Modifier.fillMaxSize(),
                    painter = painterResource(id = R.drawable.flow_card),
                    contentDescription = "product ",
                    contentScale = ContentScale.FillBounds
                )

                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(150.dp)
                        .padding(start = 60.dp, top = 40.dp),
                    verticalArrangement = Arrangement.SpaceBetween,
                ) {
                    Text(
                        text = "GET 20% OFF",
                        fontSize = 32.sp,
                        //style = MaterialTheme.typography.titleLarge,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )

                    Text(text = "Get 20% off", color = Color.White, fontSize = 16.sp)

                    VerticalSpacer()

                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(50))
                            .background(PrimaryColor)
                    ) {
                        Text(
                            text = "16 - 18 October", color = Color.Black,
                            modifier = Modifier
                                .padding(vertical = 4.dp, horizontal = 8.dp)
                        )
                    }
                }
            }
        }

        Box(
            modifier = Modifier.fillMaxSize()
        ) {
            Row(
                Modifier
                    .wrapContentHeight()
                    .absolutePadding(left = 70.dp)
                    .align(Alignment.BottomStart),
                horizontalArrangement = Arrangement.Center
            ) {
                repeat(pagerState.pageCount) { iteration ->
                    val color =
                        if (pagerState.currentPage == iteration) PrimaryColor else Color.Black
                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .clip(RoundedCornerShape(50))
                            .background(color)
                            .width(24.dp)
                            .height(8.dp)
                    )
                }
            }
        }
    }
}