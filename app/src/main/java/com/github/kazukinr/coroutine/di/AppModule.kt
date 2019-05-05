package com.github.kazukinr.coroutine.di

import android.app.Application
import android.content.Context
import com.github.kazukinr.coroutine.App
import dagger.Binds
import dagger.Module

@Module
interface AppModule {

    @Binds
    fun bindsApplication(app: App): Application

    @Binds
    fun bindsApplicationContext(application: Application): Context
}
