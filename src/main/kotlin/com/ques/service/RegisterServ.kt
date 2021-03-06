package com.ques.service

import com.ques.entity.User
import com.ques.enum.Info
import com.ques.repository.UserRepo
import com.ques.utils.PwdUtil
import com.ques.utils.Res
import org.springframework.stereotype.Service

@Service
class RegisterServ(
    val userRepo: UserRepo,
    val pwdUtil: PwdUtil
) {
    fun register(
        name: String,
        email: String,
        password: String
    ): Res {
        if(emailUsed(email))
            return Res(Info.USER_EMAIL_DUPLICATE)

        val user = User(
            name = name,
            email = email,
            password = pwdUtil.encode(password)
        )
        userRepo.save(user)
        return Res(Info.SUCCESS)
    }

    fun emailUsed(
       email: String
    ): Boolean = userRepo.getUserByEmail(email).isNotEmpty()
}