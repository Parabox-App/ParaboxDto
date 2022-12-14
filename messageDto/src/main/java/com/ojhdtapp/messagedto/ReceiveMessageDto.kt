package com.ojhdtapp.messagedto

import android.os.Parcelable
import com.ojhdtapp.messagedto.message_content.MessageContent

import kotlinx.parcelize.Parcelize

@Parcelize
data class ReceiveMessageDto(
    val contents: List<MessageContent>,
    val profile: Profile,
    val subjectProfile: Profile,
    val timestamp: Long,
    val messageId: Long?,
    val pluginConnection: PluginConnection
) : Parcelable