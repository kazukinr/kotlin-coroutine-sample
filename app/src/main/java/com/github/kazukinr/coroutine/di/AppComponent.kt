package com.github.kazukinr.coroutine.di

import com.github.kazukinr.coroutine.App
import dagger.Component
import dagger.android.AndroidInjector

@Component(
    modules = [
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {

    @Component.Factory
    interface Factory : AndroidInjector.Factory<App>
}
