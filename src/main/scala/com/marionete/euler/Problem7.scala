package com.marionete.euler

object Problem7 extends App {
  def isPrime(n: Int): Boolean = {
    def run(n: Int, div: Int): Boolean = {
      (n % div) match {
        case 0 => false
        case _ if div > math.sqrt(n).toInt => true
        case _ => run(n, div+1)
      }
    }
    if (n <= 3) true
    else run(n, 2)
  }

  def getNthPrime(n: Int): Int = {
    def run(n: Int, ith: Int): Int = {
      (isPrime(n), ith) match {
        case (true, 1) => n
        case (true, _) => run(n+1, ith-1)
        case (false, _) => run(n+1, ith)
      }
    }
    run(2, n)
  }

  println(getNthPrime(10001))
//  println(getNthPrime(4))
//  println(getNthPrime(5))
//  println(getNthPrime(6))

}
