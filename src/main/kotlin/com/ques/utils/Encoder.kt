package com.ques.utils

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class Encoder(
    private val bCryptPasswordEncoder: BCryptPasswordEncoder = BCryptPasswordEncoder(4)
) {

    fun encode(
        plain: String
    ): String = bCryptPasswordEncoder.encode(plain)

    fun notMatch(
        plain: String,
        cipher: String
    ): Boolean = !bCryptPasswordEncoder.matches(plain, cipher)

}