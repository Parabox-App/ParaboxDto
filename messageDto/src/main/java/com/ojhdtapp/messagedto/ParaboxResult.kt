package com.ojhdtapp.paraboxdevelopmentkit.connector

import android.os.Bundle
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
sealed class ParaboxResult(
    open val command: Int,
    open val timestamp: Long,
) : Parcelable {
    data class Success(
        override val command: Int,
        override val timestamp: Long,
        val obj : Bundle = Bundle()
    ) : ParaboxResult(command = command, timestamp = timestamp)

    data class Fail(
        override val command: Int,
        override val timestamp: Long,
        val errorCode: Int,
    ) : ParaboxResult(command = command, timestamp = timestamp)
}