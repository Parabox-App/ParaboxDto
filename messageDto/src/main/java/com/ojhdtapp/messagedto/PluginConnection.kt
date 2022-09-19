package com.ojhdtapp.messagedto

import android.os.Parcelable
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
data class PluginConnection(val connectionType: Int, val sendTargetType: Int, val id: Long) :
    Parcelable {
    @IgnoredOnParcel
    val objectId = getObjectId(connectionType, sendTargetType, id)
    override fun equals(other: Any?): Boolean {
        return if (other is PluginConnection) {
            objectId == other.objectId
        } else
            super.equals(other)
    }

    override fun hashCode(): Int {
        var result = connectionType
        result = 31 * result + objectId.hashCode()
        return result
    }
}
object SendTargetType {
    const val USER = 0
    const val GROUP = 1
}
fun getObjectId(connectionType: Int, sendTargetType: Int, id: Long) : Long{
    return "${connectionType}${sendTargetType}${id}".toLong()
}