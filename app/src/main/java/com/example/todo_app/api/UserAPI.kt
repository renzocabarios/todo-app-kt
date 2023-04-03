package com.example.todo_app.api

import com.example.todo_app.models.CreateUserRequest
import com.example.todo_app.models.HttpResponse
import com.example.todo_app.models.UpdateUserRequest
import com.example.todo_app.models.UserModel
import retrofit2.http.Body
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.PATCH
import retrofit2.http.POST

interface UserAPI {
    @GET("/users")
    suspend fun getAll() : HttpResponse<UserModel>

    @GET("/users/{id}")
    suspend fun getById() : HttpResponse<UserModel>

    @POST("/users")
    suspend fun create(@Body request: CreateUserRequest) : HttpResponse<UserModel>

    @PATCH("/users/{id}")
    suspend fun update(@Body request: UpdateUserRequest) : HttpResponse<UserModel>

    @DELETE("/users/{id}")
    suspend fun update() : HttpResponse<UserModel>
}