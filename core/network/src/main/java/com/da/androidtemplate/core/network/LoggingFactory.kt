package com.da.androidtemplate.core.network

import okhttp3.logging.HttpLoggingInterceptor

object LoggingFactory {

    fun create(): HttpLoggingInterceptor {
        return HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        }
    }
}