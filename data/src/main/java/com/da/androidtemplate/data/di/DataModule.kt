package com.da.androidtemplate.data.di

import com.da.androidtemplate.data.api.TestApi
import com.da.androidtemplate.core.network.provideApi
import org.koin.dsl.module


val dataModule = module {

    single { provideApi<TestApi>(get()) }

    // Repository
//    single<TestRepository> {
//        TestRepositoryImpl(
//            api = get()
//        )
//    }
}
