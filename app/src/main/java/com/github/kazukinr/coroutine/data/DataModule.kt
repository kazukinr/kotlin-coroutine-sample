package com.github.kazukinr.coroutine.data

import com.github.kazukinr.coroutine.data.api.GithubApi
import com.github.kazukinr.coroutine.data.api.GithubApiClient
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindsGithubApi(client: GithubApiClient): GithubApi
}