package com.elektra.mvvmposts.ui.post

import com.elektra.mvvmposts.network.PostApi
import javax.inject.Inject

class PostListViewModel {
    @Inject
    lateinit var postApi: PostApi
}