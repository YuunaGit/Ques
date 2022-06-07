package com.ques.entity

import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "e_user")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var uid: Int = 0,
    var name: String,
    var email: String,
    var password: String,
    var state: Int = 0,
    var createdAt: LocalDateTime = LocalDateTime.now()
)