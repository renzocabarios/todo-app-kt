package com.example.todo_app.models

data class HttpResponse<T>(
    val data: Array<T>,
    val status: String,
    val message: String
) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as HttpResponse<*>

        if (!data.contentEquals(other.data)) return false
        if (status != other.status) return false
        if (message != other.message) return false

        return true
    }

    override fun hashCode(): Int {
        var result = data.contentHashCode()
        result = 31 * result + status.hashCode()
        result = 31 * result + message.hashCode()
        return result
    }

}
