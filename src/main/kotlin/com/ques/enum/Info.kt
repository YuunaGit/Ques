package com.ques.enum

import com.fasterxml.jackson.annotation.JsonFormat

@JsonFormat(shape = JsonFormat.Shape.OBJECT)
enum class Info(
    val code: Int,
    val msg: String
) {
    SUCCESS(200, "Success"),
    FAIL(201, "Fail"),
    NOT_NULL(203, "Null param"),
    ILLEGAL_PARAM(204, "Blank param"),

    USER_EMAIL_DUPLICATE(301, "Email already used"),
    PASSWORD_WRONG(302, "Password wrong")
}