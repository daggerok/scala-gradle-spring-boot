package com.gaggerok.scala.spring.calc

import com.gaggerok.scala.spring.calc.Calc._
import org.junit.Assert._
import org.junit.Test

class ScalaJUnitTest {
  @Test def testAdd() {
    assertEquals(3, add(1, 2))
  }
}
