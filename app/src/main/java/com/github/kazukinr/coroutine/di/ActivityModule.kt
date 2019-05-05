package com.github.kazukinr.coroutine.di

import com.github.kazukinr.coroutine.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {

    @ContributesAndroidInjector
    fun contributeMainActivity(): MainActivity
}