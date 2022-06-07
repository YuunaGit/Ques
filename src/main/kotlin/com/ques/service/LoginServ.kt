package com.ques.service

import com.ques.enum.Info
import com.ques.repository.UserRepo
import com.ques.utils.PwdUtil
import com.ques.utils.Res
import org.springframework.stereotype.Service

@Service
class LoginServ(
    val userRepo: UserRepo,
    val pwdUtil: PwdUtil
) {
    fun login(
        email: String,
        password: String
    ): Res {
        val users = userRepo.getUserByEmail(email)

        if(users.size != 1)
            return Res(Info.FAIL)

        val user = users.first()

        if(pwdUtil.notMatch(password, user.password))
            return Res(Info.PASSWORD_WRONG)

        return Res(Info.SUCCESS, user)
    }
}