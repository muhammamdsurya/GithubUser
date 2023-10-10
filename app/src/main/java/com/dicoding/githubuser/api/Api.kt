package com.dicoding.githubuser.api

import com.dicoding.githubuser.BuildConfig
import com.dicoding.githubuser.data.model.DetailUserResponse
import com.dicoding.githubuser.data.model.User
import com.dicoding.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface Api {

    @GET("search/users")
    @Headers("Authorization: token " + BuildConfig.API_TOKEN)
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>

    @GET("users/{username}")
    @Headers("Authorization: token " + BuildConfig.API_TOKEN)
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailUserResponse>

    @GET("users/{username}/followers")
    @Headers("Authorization: token " + BuildConfig.API_TOKEN)
    fun getFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>

    @GET("users/{username}/following")
    @Headers("Authorization: token " + BuildConfig.API_TOKEN)
    fun getFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>
}