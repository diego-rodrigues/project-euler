package com.marionete.euler

object Problem4 extends App {

  def isPalindrome(value: Int):Boolean = {
    value.toString.reverse == value.toString
  }

  def isDivisibleBy3NumberDigit(value: Int, divisor: Int): Boolean = {
    if (divisor < 100)
      return false
    if (value % divisor == 0) {
      if (value / divisor / 100 < 10)
        return true
    }
    return isDivisibleBy3NumberDigit(value, divisor-1)
  }

  def findBiggestPalindrome(value: Int): Int = {
    if (isPalindrome(value) && isDivisibleBy3NumberDigit(value, 999))
      value
    else
      findBiggestPalindrome(value-1)
  }

  print(findBiggestPalindrome(999*999))
}
