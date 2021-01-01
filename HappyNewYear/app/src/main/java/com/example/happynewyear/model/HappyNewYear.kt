package com.example.happynewyear.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class HappyNewYear(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)