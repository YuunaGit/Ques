package com.ques

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class QuesApplication

fun main(args: Array<String>) {
    runApplication<QuesApplication>(*args)
}
