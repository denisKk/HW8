package com.kulakov.kmm_hw8

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform