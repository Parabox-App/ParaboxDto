package com.ojhdtapp.messagedto.message_content

import kotlinx.parcelize.Parcelize

@Parcelize
data class Image(val url: String) : MessageContent {
    val type = MessageContent.IMAGE
    override fun getContentString(): String {
        return "[图片]"
    }
}