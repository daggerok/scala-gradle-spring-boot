package org.gradle

import org.junit.Test
import org.junit.Assert._

import Calc._

class ScalaJUnitTest {
  @Test def testAdd() {
    assertEquals(3, add(1, 2))
  }
}
