package com.heiwig.dfabackendapi

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DfaBackendApiApplication

fun main(args: Array<String>) {
	SpringApplication.run(DfaBackendApiApplication::class.java, *args)
}
