package com.gaggerok.scala.spring.web

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping

@Controller
class IndexCtrl {

  @RequestMapping(Array("/"))
  def handleRootRequest(): String = "index"
}
