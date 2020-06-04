package com.marionete.euler

object Problem6 extends App {
  val n = 100
  val a = (n * (n + 1) * (2 * n + 1))/6
  val b = ((n * (n + 1))/2)*((n * (n + 1))/2)

  println(a)
  println(b)
  println(b-a)
}
