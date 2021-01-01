package com.example.happynewyear.data

import com.example.happynewyear.R
import com.example.happynewyear.R.string
import com.example.happynewyear.model.HappyNewYear

class Datasource() {

    fun loadAffirmations(): List<HappyNewYear> {
        return listOf<HappyNewYear>(
            HappyNewYear(string.month1, R.drawable.image1),
            HappyNewYear(string.month2, R.drawable.image2),
            HappyNewYear(string.month3, R.drawable.image3),
            HappyNewYear(string.month4, R.drawable.image4)
        )
    }
}