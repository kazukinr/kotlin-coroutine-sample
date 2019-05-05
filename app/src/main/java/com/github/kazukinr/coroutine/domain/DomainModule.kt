package com.github.kazukinr.coroutine.domain

import com.github.kazukinr.coroutine.data.DataModule
import dagger.Binds
import dagger.Module

@Module(
    includes = [
        DataModule::class
    ]
)
interface DomainModule {

    @Binds
    fun bindsFetchRepos(impl: FetchReposImpl): FetchRepos
}