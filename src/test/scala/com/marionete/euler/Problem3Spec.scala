package com.marionete.euler

import org.scalatest.wordspec

class Problem3Spec extends wordspec.AnyWordSpec {
  "N" when {
    "is equal to 2" must {
      "have maximum prime factor equals to 2" in {
        assert(Problem3.maximumPrimeFactor(2) == 2)
      }
    }

    "is equal to 3" must {
      "have maximum prime factor equals to 3" in {
        assert(Problem3.maximumPrimeFactor(3) == 3)
      }
    }

    "is equal to 4" must {
      "have maximum prime factor equals to 4" in {
        assert(Problem3.maximumPrimeFactor(4) == 2)
      }
    }

    "is equal to 5" must {
      "have maximum prime factor equals to 5" in {
        assert(Problem3.maximumPrimeFactor(5) == 5)
      }
    }

    "is equal to 6" must {
      "have maximum prime factor equals to 6" in {
        assert(Problem3.maximumPrimeFactor(6) == 3)
      }
    }

    "is equal to 7" must {
      "have maximum prime factor equals to 7" in {
        assert(Problem3.maximumPrimeFactor(7) == 7)
      }
    }

    "is equal to 8" must {
      "have maximum prime factor equals to 2" in {
        assert(Problem3.maximumPrimeFactor(8) == 2)
      }
    }

    "is equal to 600851475143" must {
      "have maximum prime factor equals to 6857" in {
        assert(Problem3.maximumPrimeFactor(600851475143L) == 6857)
      }
    }
  }
}
