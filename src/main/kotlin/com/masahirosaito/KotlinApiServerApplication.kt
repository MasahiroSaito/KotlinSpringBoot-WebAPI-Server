package com.masahirosaito

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinApiServerApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinApiServerApplication::class.java, *args)
}
