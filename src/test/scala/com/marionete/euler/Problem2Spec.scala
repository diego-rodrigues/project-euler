package com.marionete.euler

import org.scalatest.wordspec

class Problem2Spec extends wordspec.AnyWordSpec {
  "N" when {
    "is limited to 1" must {
      "have sum equals to 1" in {
        assert(Problem2.sumOfFibonacciAtMax(1) == 0)
      }
    }

    "is limited to 2" must {
      "have sum equals to 0" in {
        assert(Problem2.sumOfFibonacciAtMax(2) == 0)
      }
    }

    "is limited to 3" must {
      "have sum equals to 2" in {
        assert(Problem2.sumOfFibonacciAtMax(3) == 2)
      }
    }

    "is limited to 4" must{
      "have sum equals to 2" in {
        assert(Problem2.sumOfFibonacciAtMax(4) == 2)
      }
    }

    "is limited to 5" must{
      "have sum equals to 2" in {
        assert(Problem2.sumOfFibonacciAtMax(5) == 2)
      }
    }

    "is limited to 6" must{
      "have sum equals to 2" in {
        assert(Problem2.sumOfFibonacciAtMax(6) == 2)
      }
    }

    "is limited to 13" must{
      "have sum equals to 10" in {
        assert(Problem2.sumOfFibonacciAtMax(13) == 10)
      }
    }

    "is limited to 35" must{
      "have sum equals to 44" in {
        assert(Problem2.sumOfFibonacciAtMax(35) == 44)
      }
    }

    "is limited to 90" must{
      "have sum equals to 44" in {
        assert(Problem2.sumOfFibonacciAtMax(90) == 44)
      }
    }
  }

}
