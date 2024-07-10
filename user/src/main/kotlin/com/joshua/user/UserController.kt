package com.joshua.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {
    @GetMapping("/users")
    fun getUsers() : List<User> {
        return emptyList()
    }

    @GetMapping("/hello")
    fun helloworld() : String {
        return "Hello World"
    }
}