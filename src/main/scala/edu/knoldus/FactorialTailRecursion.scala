package edu.knoldus

import scala.annotation.tailrec

class FactorialTailRecursion {
  def factorial(n: BigInt): BigInt = {
    @tailrec
    def factorialWithAcc(n: BigInt, acc: BigInt): BigInt = {
      if (n == 1) acc
      else factorialWithAcc(n - 1, acc * n)
    }

    factorialWithAcc(n, acc = 1)
  }
}

