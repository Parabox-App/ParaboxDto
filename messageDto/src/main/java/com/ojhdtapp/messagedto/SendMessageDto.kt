package com.ojhdtapp.messagedto

import android.os.Parcelable
import com.ojhdtapp.messagedto.message_content.MessageContent
import kotlinx.parcelize.Parcelize


@Parcelize
data class SendMessageDto(
    val contents: List<MessageContent>,
    val timestamp: Long,
    val pluginConnection: PluginConnection,
    val messageId: Long?,
) : Parcelable