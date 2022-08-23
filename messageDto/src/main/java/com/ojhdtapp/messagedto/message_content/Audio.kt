package com.ojhdtapp.messagedto.message_content

import android.content.Intent
import android.net.Uri
import kotlinx.parcelize.Parcelize
import java.io.File

@Parcelize
data class Audio(
    val url: String? = null,
    val length: Long = 0L,
    val fileName: String = "",
    val fileSize: Long = 0L,
    val sendIntent: Intent? = null,
    val uri: Uri? = null
) : MessageContent {
    val type = MessageContent.AUDIO
    override fun getContentString(): String {
        return "[语音]"
    }
}
