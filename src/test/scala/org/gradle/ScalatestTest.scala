package org.gradle

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import org.scalatest.junit.JUnitRunner
import Calc._

@RunWith(classOf[JUnitRunner])
class ScalatestTest extends FunSuite with BeforeAndAfter {
  test("add") {
    assert(3 == add(1, 2))
  }
}
