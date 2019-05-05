package com.github.kazukinr.coroutine.domain

import com.github.kazukinr.coroutine.data.api.GithubApi
import com.github.kazukinr.coroutine.data.dto.Repo
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import timber.log.Timber
import javax.inject.Inject

interface FetchRepos {

    operator fun invoke(): Deferred<List<Repo>>
}

class FetchReposImpl @Inject constructor(
    private val githubApi: GithubApi
) : FetchRepos {

    override fun invoke(): Deferred<List<Repo>> = GlobalScope.async {
        Timber.i("FetchRepos has been started on [${Thread.currentThread().name}]")

        val repos = githubApi.fetchRepos("kazukinr")
        Timber.i("FetchRepos has been completed on [${Thread.currentThread().name}]")

        return@async repos
    }
}
