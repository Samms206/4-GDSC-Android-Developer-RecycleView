package com.example.testing

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class movies(
    val name:String,
    val description:String,

):Parcelable
