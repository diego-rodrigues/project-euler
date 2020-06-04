package com.marionete.euler

object Problem5 extends App {
  def minimumDividedByAll(numbersList: List[Int]): Int = {
    def divideBy(list: List[Int], divisor: Int): Int = {
      var flag = false
      val newList = list
        .map(x => if (x % divisor == 0) { flag = true; x / divisor } else x)
        .filter(_ != 1)

      list.size match {
        case 0 if flag => divisor
        case 0         => 1
        case _ if flag => divisor * divideBy(newList, divisor)
        case _         => divideBy(newList, divisor+1)
      }
    }
    divideBy(numbersList, 2)
  }


  print(minimumDividedByAll(List(2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)))
}
