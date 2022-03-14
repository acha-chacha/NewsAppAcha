package com.haura.newsappacha.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class NewsModel (
    var image : Int = 0,
    var title : String = "",
    var desc : String = ""
):Parcelable

