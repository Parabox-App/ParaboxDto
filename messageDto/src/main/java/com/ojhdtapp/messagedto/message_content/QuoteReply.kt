package com.ojhdtapp.messagedto.message_content

import kotlinx.parcelize.Parcelize

@Parcelize
data class QuoteReply(
    val quoteMessageSenderName: String,
    val quoteMessageTimestamp: Long,
    val quoteMessageId: Long?,
    val quoteMessageContent: List<MessageContent>
) : MessageContent {
    val type = MessageContent.QUOTE_REPLY
    override fun getContentString(): String {
        return "[引用回复]"
    }
}