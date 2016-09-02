package com.gaggerok.scala.spring.calc

import com.gaggerok.scala.spring.calc.Calc._
import org.junit.runner.RunWith
import org.scalatest.{BeforeAndAfter, FunSuite}
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ScalatestTest extends FunSuite with BeforeAndAfter {
  test("add") {
    assert(3 == add(1, 2))
  }
}
