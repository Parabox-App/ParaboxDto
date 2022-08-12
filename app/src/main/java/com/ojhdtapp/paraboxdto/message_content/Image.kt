package com.ojhdtapp.paraboxdto.message_content

import com.ojhdtapp.paraboxdto.message_content.MessageContent
import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(val url: String) : MessageContent {
    val type = MessageContent.IMAGE
    override fun getContentString(): String {
        return "[图片]"
    }
}