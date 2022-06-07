package com.ques.controller

import com.ques.enum.Info
import com.ques.service.LoginServ
import com.ques.service.RegisterServ
import com.ques.utils.Res
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    val registerServ: RegisterServ,
    val loginServ: LoginServ
) {

    @PostMapping("/register")
    fun register(
        name: String,
        email: String,
        password: String
    ): Res = registerServ.register(name, email, password)


    @PostMapping("/login")
    fun loginByEmail(
        email: String,
        password: String
    ): Res = loginServ.login(email, password)

    @PostMapping("/update/user/name")
    fun updateUserName(
        name: String,
        password: String
    ): Res = Res(Info.SUCCESS)

    @PostMapping("/update/user/email")
    fun updateUserEmail(
        name: String,
        password: String
    ): Res = Res(Info.SUCCESS)

    @PostMapping("/update/user/password")
    fun updateUserPwd(
        name: String,
        password: String
    ): Res = Res(Info.SUCCESS)

}