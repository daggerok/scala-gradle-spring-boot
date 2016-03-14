package com.gaggerok.scala.spring.calc

import org.junit.Test
import org.junit.Assert._
import com.gaggerok.scala.spring.calc.Calc._

class ScalaJUnitTest {
  @Test def testAdd() {
    assertEquals(3, add(1, 2))
  }
}
