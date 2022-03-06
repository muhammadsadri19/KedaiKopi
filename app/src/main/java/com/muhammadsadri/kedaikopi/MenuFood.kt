package com.muhammadsadri.kedaikopi

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class MenuFood(
    val imgFood: Int,
    val harga:String,
    val titleFood: String
) :Parcelable
