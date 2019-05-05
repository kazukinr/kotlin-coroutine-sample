package com.github.kazukinr.coroutine.ui

import android.os.Bundle
import com.github.kazukinr.coroutine.R
import com.github.kazukinr.coroutine.domain.FetchRepos
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import timber.log.Timber
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var fetchRepos: FetchRepos

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch(Dispatchers.Main) {
            Timber.i("FetchRepos will be called on [${Thread.currentThread().name}]")
            val repos = fetchRepos().await()
            Timber.i("Return value has been successfully gotten on [${Thread.currentThread().name}]")
        }
    }
}
