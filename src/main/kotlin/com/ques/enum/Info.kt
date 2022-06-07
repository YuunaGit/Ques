package com.ques.enum

import com.fasterxml.jackson.annotation.JsonFormat

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
enum class Info(
    val code: Int,
    val msg: String
) {
    SUCCESS(200, "Success"),
    FAIL(201, "Fail"),

    USER_NAME_DUPLICATE(300, "This user name has already been used"),
    USER_EMAIL_DUPLICATE(301, "This email has already been used"),
    PASSWORD_WRONG(302, "Password wrong")
}