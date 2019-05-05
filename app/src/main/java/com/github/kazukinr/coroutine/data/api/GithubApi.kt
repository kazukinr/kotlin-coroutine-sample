package com.github.kazukinr.coroutine.data.api

import com.github.kazukinr.coroutine.data.dto.Repo

interface GithubApi {

    fun fetchRepos(user: String): List<Repo>
}