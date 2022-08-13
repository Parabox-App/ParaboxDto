package com.ojhdtapp.messagedto.message_content

import kotlinx.parcelize.Parcelize
import java.io.File

@Parcelize
data class ImageSend(val file: File) : MessageContent {
    val type = MessageContent.IMAGE
    override fun getContentString(): String {
        return "[图片]"
    }
}