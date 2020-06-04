package com.marionete

import com.marionete.euler.Problem7

object Problem10 extends App {

  def sumOfAllPrimes(max: Int): BigInt = {
    def apply(n: Int, max: Int): BigInt = {
      var sum: BigInt = 0
      for (i <- n until max by 2){
        if (Problem7.isPrime(i)) sum += i
      }
      sum
    }
    2 + apply(3, max)
  }


//  1179908154

  println(sumOfAllPrimes(2000000))
}

