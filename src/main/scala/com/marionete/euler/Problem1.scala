package com.marionete.euler

object Problem1 extends App {
/*  def sumOfMultiples(n: Int): Int = {
    val x = n - 1
    if (x < 3) 0
    else if (x % 3 == 0) x + sumOfMultiples(x)
    else if (x % 5 == 0) x + sumOfMultiples(x)
    else sumOfMultiples(x)
  }*/

  /*def sumOfMultiples(n: Int): Int = {
    n-1 match {
      case x if x < 3 => 0
      case x if (x % 3 == 0) || (x % 5 == 0) => x + sumOfMultiples(x)
      case x => sumOfMultiples(x)
    }
  }*/

  def sumOfMultiples(n: Int): Int = {
    (3 until n).toList.foldLeft(0)((acc,x) => x match {
      case x if (x % 3 == 0) || (x % 5 == 0) => acc + x
      case _ => acc
    })
  }


  println(sumOfMultiples(1000))
}

