package com.ojhdtapp.messagedto.message_content

import kotlinx.parcelize.Parcelize
import java.io.File

@Parcelize
data class Audio(val url: String, val length: Long, val fileName: String, val fileSize: Long) : MessageContent{
    val type = MessageContent.AUDIO
    override fun getContentString(): String {
        return "[语音]"
    }
}
