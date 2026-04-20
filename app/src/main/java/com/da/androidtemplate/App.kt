package com.da.androidtemplate

import android.app.Application
import com.da.androidtemplate.core.network.di.networkModule
import com.da.androidtemplate.di.appModule
import com.da.androidtemplate.data.di.dataModule
import com.da.androidtemplate.domain.di.domainModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(
                appModule,
                networkModule,
                dataModule,
                domainModule
            )
        }
    }
}