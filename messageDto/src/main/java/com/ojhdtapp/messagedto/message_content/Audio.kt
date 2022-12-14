package com.ojhdtapp.messagedto.message_content

import android.net.Uri
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
data class Audio(
    val url: String? = null,
    val length: Long = 0L,
    val fileName: String = "",
    val fileSize: Long = 0L,
    val uri: Uri? = null
) : MessageContent {
    @IgnoredOnParcel
    val type = MessageContent.AUDIO
    override fun getContentString(): String {
        return "[语音]"
    }
}
