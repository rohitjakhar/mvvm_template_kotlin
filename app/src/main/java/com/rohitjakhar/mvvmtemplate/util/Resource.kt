package com.rohitjakhar.mvvmtemplate.util

sealed class Resource<T>(
    open val data: T? = null,
    open val message: String = "",
    open val errorType: ErrorType = ErrorType.UNKNOWN
) {
    class Loading<T>() : Resource<T>()

    data class Success<T>(override val data: T?, override val message: String = "") : Resource<T>()

    data class Error<T>(
        override val errorType: ErrorType = ErrorType.UNKNOWN,
        override val message: String = errorType.errorMessage
    ) : Resource<T>()
}

enum class ErrorType(val errorMessage: String) {
    UNKNOWN(errorMessage = "Error"),
    EMPTY_DATA("Empty Data"),
    NO_INTERNET("Empty Data"),
    TIME_OUT("Time Out")
}
