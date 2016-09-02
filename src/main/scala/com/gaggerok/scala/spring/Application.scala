package com.gaggerok.scala.spring

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

object Application extends App {
  SpringApplication.run(classOf[Application])
}

@SpringBootApplication
class Application

// put here your bean configuration
