package com.ques.repository

import com.ques.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepo: JpaRepository<User, Int> {
    fun getUserByEmail(email: String): List<User>
}