package com.github.kazukinr.coroutine.data.api

import com.github.kazukinr.coroutine.data.dto.Repo
import dagger.Reusable
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import javax.inject.Inject

@Reusable
class GithubApiClient constructor(private val service: Service) : GithubApi {

    @Inject
    constructor() : this(
        Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(Service::class.java)
    )

    override fun fetchRepos(user: String): List<Repo> {
        return service.fetchRepos(user)
            .execute()
            .body() ?: emptyList()
    }


    interface Service {

        @GET("users/{user}/repos")
        fun fetchRepos(@Path("user") user: String): Call<List<Repo>>
    }
}
