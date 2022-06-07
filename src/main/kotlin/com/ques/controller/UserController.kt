package com.ques.controller

import com.ques.enum.Info
import com.ques.hasNotBlank
import com.ques.service.LoginServ
import com.ques.service.ProfileServ
import com.ques.service.RegisterServ
import com.ques.utils.Res
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(
    val registerServ: RegisterServ,
    val loginServ: LoginServ,
    val profileServ: ProfileServ
) {

    @PostMapping("/register")
    fun register(
        name: String,
        email: String,
        password: String
    ): Res = if (name.hasNotBlank()
        and email.hasNotBlank()
        and password.hasNotBlank())
        registerServ.register(name, email, password)
    else Res(Info.ILLEGAL_PARAM)

    @PostMapping("/login")
    fun login(
        email: String,
        password: String
    ): Res = if (email.hasNotBlank()
        and password.hasNotBlank())
        loginServ.login(email, password)
    else Res(Info.ILLEGAL_PARAM)

    @PostMapping("/update/user/name")
    fun updateUserName(
        password: String,
        name: String
    ): Res = if (password.hasNotBlank()
        and name.hasNotBlank())
        profileServ.updateUserName(password, name)
    else Res(Info.ILLEGAL_PARAM)

    @PostMapping("/update/user/email")
    fun updateUserEmail(
        password: String,
        name: String
    ): Res = if (password.hasNotBlank()
        and name.hasNotBlank())
        profileServ.updateUserName(password, name)
    else Res(Info.ILLEGAL_PARAM)

    @PostMapping("/update/user/pwd")
    fun updateUserPwd(
        old_password: String,
        new_password: String
    ): Res = if (old_password.hasNotBlank()
        and new_password.hasNotBlank())
        profileServ.updateUserName(old_password, new_password)
    else Res(Info.ILLEGAL_PARAM)

}