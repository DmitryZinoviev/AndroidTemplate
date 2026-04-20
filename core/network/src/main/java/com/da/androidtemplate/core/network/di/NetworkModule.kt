package com.da.androidtemplate.core.network.di

import com.da.androidtemplate.core.network.LoggingFactory
import com.da.androidtemplate.core.network.MoshiFactory
import com.da.androidtemplate.core.network.OkHttpFactory
import com.da.androidtemplate.core.network.RetrofitFactory
import org.koin.dsl.module
import retrofit2.Retrofit

val networkModule = module {

    single { LoggingFactory.create() }

    single { OkHttpFactory.create(get()) }

    single { MoshiFactory.create() }

    single {
        RetrofitFactory.create(
            okHttpClient = get(),
            moshi = get(),
            baseUrl = ""
        )
    }

//    single<ServiceApi> {
//        get<Retrofit>().create(ServiceApi::class.java)
//    }


}