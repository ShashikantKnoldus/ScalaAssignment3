package edu.knoldus
import org.scalatest.flatspec.AnyFlatSpec

class TestFactorial extends AnyFlatSpec  {
 val number= new FactorialRecursion
 //Test case-1
 "Factorial of 5" should "return 120"in{
   assert(120==number.factorial(5))
 }
 //Test case-2
  "Factorial of 10" should "return 3628800"in{
    assert(3628800==number.factorial(10))
  }
}
