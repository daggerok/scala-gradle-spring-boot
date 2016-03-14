package app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.Configuration
import org.springframework.boot.autoconfigure.AutoConfigurationPackages.BasePackages
import org.springframework.boot.autoconfigure.AutoConfigurationPackages.BasePackages

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = Array(
  "app", "org.gradle"
))
class WebCfg

//@SpringBootApplication
object WebApp extends App {
  SpringApplication.run(classOf[WebCfg])
}
