package com.ojhdtapp.messagedto.message_content

import kotlinx.parcelize.Parcelize
import java.io.File

@Parcelize
data class AudioSend(val file: File) : MessageContent{
    val type = MessageContent.AUDIO
    override fun getContentString(): String {
        return "[语音]"
    }
}
