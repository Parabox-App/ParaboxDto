package com.ojhdtapp.messagedto.message_content

import kotlinx.parcelize.Parcelize

@Parcelize
object AtAll: MessageContent {
    val type = MessageContent.AT_ALL
    override fun getContentString(): String {
        return "全体成员"
    }
}