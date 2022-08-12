package com.ojhdtapp.paraboxdto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Profile(
    val name: String,
    val avatar: String?
) : Parcelable