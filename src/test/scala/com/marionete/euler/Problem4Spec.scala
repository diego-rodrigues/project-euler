package com.marionete.euler

import org.scalatest.wordspec

class Problem4Spec extends wordspec.AnyWordSpec {
  "N" when {
    "equals to 1" must {
      "be a palindrome" in {
        assert(Problem4.isPalindrome(value=1) == true)
      }
    }

    "equals to 999999" must {
      "be a palindrome" in {
        assert(Problem4.isPalindrome(value=999999) == true)
      }
    }

    "equals to 999998" must {
      "not be a palindrome" in {
        assert(Problem4.isPalindrome(value=999998) == false)
      }
    }
  }

}
