package com.ojhdtapp.messagedto.message_content

import kotlinx.parcelize.Parcelize
import java.io.File

@Parcelize
data class Image(val url: String, val width: Int, val height: Int, val file: File) : MessageContent {
    val type = MessageContent.IMAGE
    override fun getContentString(): String {
        return "[图片]"
    }
}