package com.kulakov.kmm_hw8

import kotlinx.serialization.Serializable

@Serializable
data class BeerList(
    val beers: List<BeerElement>? = null
)
