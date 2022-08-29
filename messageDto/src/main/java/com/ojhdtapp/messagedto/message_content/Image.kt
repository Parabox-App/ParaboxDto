package com.ojhdtapp.messagedto.message_content

import android.content.Intent
import android.net.Uri
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize
import java.io.File

@Parcelize
data class Image(
    val url: String? = null,
    val width: Int = 0,
    val height: Int = 0,
    val uri: Uri? = null,
) : MessageContent {
    @IgnoredOnParcel
    val type = MessageContent.IMAGE
    override fun getContentString(): String {
        return "[图片]"
    }
}