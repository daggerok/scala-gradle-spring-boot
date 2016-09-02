package com.gaggerok.scala.spring

import com.gaggerok.scala.spring.calc.Calc
import org.junit.runner.RunWith
import org.specs2.Specification
import org.specs2.runner.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ScalaSpec2Test extends Specification {
  def is =
    s2"""

  The Calculator add function should
    add posetives                    $posetives
    add negatives                    $negatives
    add zeroes                       $zeroes

  """

  def posetives = Calc.add(1, 2) === 3

  def negatives = Calc.add(-5, 2) === -3

  def zeroes = Calc.add(0, 1) === 1
}
