package com.ojhdtapp.messagedto

object ObjectIdUtil {
    fun getObjectId(connectionType: Int, sendTargetType: Int, id: Long): Long {
        return "${connectionType}${sendTargetType}${id}".toLong()
    }

    fun getSendTargetType(objectId: Long, connectionTypeLength: Int): Int {
        return objectId.toString()[connectionTypeLength].digitToInt()
    }
    fun getId(objectId: Long, connectionTypeLength: Int) : Long{
        return objectId.toString().substring(connectionTypeLength + 1).toLong()
    }
}
object SendTargetType {
    const val USER = 0
    const val GROUP = 1
}