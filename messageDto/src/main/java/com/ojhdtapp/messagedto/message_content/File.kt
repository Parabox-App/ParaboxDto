package com.ojhdtapp.messagedto.message_content

import kotlinx.android.parcel.Parcelize

@Parcelize
data class File(
    val url: String? = null,
    val name: String,
    val size: Long,
    val lastModifiedTime: Long,
    val expiryTime: Long? = null,
    val uri: String? = null
): MessageContent {
    val type = MessageContent.FILE
    override fun getContentString(): String {
        return "[文件]"
    }
}
