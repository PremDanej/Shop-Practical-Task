package com.merp.jet.shop.practical.app.model

data class Product(
    val name: String,
    val isLiked: Boolean = false,
    val isBest: Boolean = false,
    val inStock: Boolean = true,
)