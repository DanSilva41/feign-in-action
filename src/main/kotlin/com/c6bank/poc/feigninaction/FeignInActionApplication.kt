package com.c6bank.poc.feigninaction

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class FeignInActionApplication

fun main(args: Array<String>) {
	runApplication<FeignInActionApplication>(*args)
}
