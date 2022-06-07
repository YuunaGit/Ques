package com.ques.utils

import org.springframework.stereotype.Service
import java.security.MessageDigest
import java.util.Base64

@Service
class PwdUtil(
    val md: MessageDigest = MessageDigest.getInstance("SHA-256"),
    val b64encoder: Base64.Encoder = Base64.getEncoder(),
    val b64decoder: Base64.Decoder = Base64.getDecoder()
) {

    fun encode(
        plain: String
    ): String {
        val cipher = md.digest(plain.toByteArray(Charsets.UTF_8))
        return b64encoder.encodeToString(cipher)
    }

    fun notMatch(
        plain: String,
        cipher: String
    ): Boolean {
        val cipher1 = md.digest(plain.toByteArray(Charsets.UTF_8))
        val cipher2 = b64decoder.decode(cipher)
        return !MessageDigest.isEqual(cipher1, cipher2)
    }

}