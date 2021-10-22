package edu.knoldus

class FactorialRecursion {
  def factorial(n: Int): Int = {
    if (n == 0) return 1
    else factorial(n - 1) * n
  }
}
