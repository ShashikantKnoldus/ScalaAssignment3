package edu.knoldus

import org.scalatest.flatspec.AnyFlatSpec
class TestFactorialTailRec extends AnyFlatSpec {
  val number= new FactorialRecursion
  //Test case-1
  "Factorial of 11" should "return 39916800"in{
    assert(39916800==number.factorial(11))
  }
  //Test case-2
  "Factorial of 10" should "return 3628800"in{
    assert(3628800==number.factorial(10))
  }

}
