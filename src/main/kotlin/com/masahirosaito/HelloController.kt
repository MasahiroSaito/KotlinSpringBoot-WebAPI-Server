package com.masahirosaito

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController {

    @RequestMapping(value = "/")
    fun index(): String {
        return "Hello World!"
    }
}
