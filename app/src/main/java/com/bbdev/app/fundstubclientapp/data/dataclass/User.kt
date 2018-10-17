package com.bbdev.app.fundstubclientapp.data.dataclass

data class User(val uid: String,
                val email: String,
                val name: String)
{
    constructor(): this("","","")
}

interface IUser {

    fun setUserName(user: String)
}