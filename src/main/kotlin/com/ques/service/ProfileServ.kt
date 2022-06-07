package com.ques.service

import com.ques.enum.Info
import com.ques.repository.UserRepo
import com.ques.utils.Res
import org.springframework.stereotype.Service

@Service
class ProfileServ(
    val userRepo: UserRepo
){
    fun updateUserName(
        password: String,
        name: String
    ): Res {
        return Res(Info.SUCCESS)
    }

    fun updateUserEmail(
        password: String,
        email: String
    ): Res {
        return Res(Info.SUCCESS)
    }

    fun updateUserPwd(
        oldPassword: String,
        newPassword: String
    ): Res {
        return Res(Info.SUCCESS)
    }
}