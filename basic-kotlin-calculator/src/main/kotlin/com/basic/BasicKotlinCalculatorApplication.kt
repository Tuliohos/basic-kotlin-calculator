package com.basic

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BasicKotlinCalculatorApplication

fun main(args: Array<String>) {
	runApplication<BasicKotlinCalculatorApplication>(*args)
}
