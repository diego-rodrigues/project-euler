package com.marionete.euler

object Problem2 extends App{
  def sumOfFibonacciAtMax(value: Int) =
    generateFib(value, 1, 2)
      .foldLeft(0)((a, b) => a + ((b+1) % 2) * b)

  def generateFib(max_value: Int, first_value: Int, second_value: Int): List[Int] = {
    if (max_value > first_value) List(first_value) ::: generateFib(max_value, second_value, first_value+second_value)
    else List()
  }

  print(sumOfFibonacciAtMax(4000000))
}
