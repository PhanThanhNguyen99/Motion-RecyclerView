package com.example.motion_reycyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Info(
        var resourceID : Int,
        var name : String,
        var gender :String
):Parcelable