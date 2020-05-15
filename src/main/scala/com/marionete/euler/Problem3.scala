package com.marionete.euler

object Problem3 extends App {
  def maximumPrimeFactor(value: Long): Long = {
    genMaxPrimeFactor(value, 2)
  }

  def genMaxPrimeFactor(value: Long, maxFactor: Int): Long = {
    if (value <= maxFactor)
      value
    else
      (value % maxFactor) match {
        case 0 => genMaxPrimeFactor(value/maxFactor, maxFactor)
        case _ => genMaxPrimeFactor(value, maxFactor + 1)
      }
  }

  print(maximumPrimeFactor(600851475143L))
}
