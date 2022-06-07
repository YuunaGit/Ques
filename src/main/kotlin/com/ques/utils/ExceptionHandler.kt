package com.ques.utils

import com.ques.enum.Info
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

@RestControllerAdvice
class GlobalExceptionHandler {

    @ExceptionHandler
    fun handleIllegalStateException(
        ex: NullPointerException
    ): Res {
        return Res(Info.NOT_NULL, "${ex.message}")
    }

}