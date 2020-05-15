package com.marionete.euler

import org.scalatest.wordspec

class Problem1Spec extends wordspec.AnyWordSpec{
  "N" when{
    "is equal to 1" must {
      "have sum equals to 0" in {
        assert(Problem1.sumOfMultiples(1) == 0)
      }
    }

    "is equal to 2" must {
      "have sum equals to 0" in {
        assert(Problem1.sumOfMultiples(2) == 0)
      }
    }

    "is equal to 3" must {
      "have sum equals to 0" in {
        assert(Problem1.sumOfMultiples(3) == 0)
      }
    }

    "is equal to 4" must {
      "have sum equals to 3" in {
        assert(Problem1.sumOfMultiples(4) == 3)
      }
    }

    "is equal to 5" must {
      "have sum equals to 3" in {
        assert(Problem1.sumOfMultiples(5) == 3)
      }
    }

    "is equal to 6" must {
      "have sum equals to 8" in {
        assert(Problem1.sumOfMultiples(6) == 8)
      }
    }

    "is equal to 10" must {
      "have sum equals to 23" in {
        assert(Problem1.sumOfMultiples(10) == 23)
      }
    }
  }
}
