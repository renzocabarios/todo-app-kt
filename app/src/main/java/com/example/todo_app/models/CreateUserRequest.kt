package com.example.todo_app.models

data class CreateUserRequest(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String
)