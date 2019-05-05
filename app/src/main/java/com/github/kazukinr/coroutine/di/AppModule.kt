package com.github.kazukinr.coroutine.di

import android.app.Application
import android.content.Context
import com.github.kazukinr.coroutine.App
import com.github.kazukinr.coroutine.domain.DomainModule
import dagger.Binds
import dagger.Module
import dagger.android.support.AndroidSupportInjectionModule

@Module(
    includes = [
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        DomainModule::class
    ]
)
interface AppModule {

    @Binds
    fun bindsApplication(app: App): Application

    @Binds
    fun bindsApplicationContext(application: Application): Context
}
