package com.marionete.euler

//import scala.math.BigInt

object Problem8 extends App {
  def maxProduct(initialSeq: List[Char], seq: List[Char]): BigInt = {
    def run(currentSeq: List[Char], seq: List[Char], currentProd: BigInt, maximumProd: BigInt): BigInt = {
      var prod: BigInt = 1
      println(currentSeq)
      println(seq,seq.length)
//      println(seq.head.asDigit)
      println(currentProd)
      println(maximumProd)
      println("--------------")

      if (seq.length == 0) return maximumProd

      currentSeq.head.asDigit match {
        case 0 => prod = (currentSeq.tail ++ List(seq.head))
                            .map(_.asDigit)
                            .foldLeft(BigInt(1))((acc, x) => acc * x)
        case _ => prod = currentProd * seq.head.asDigit / currentSeq.head.asDigit
      }
      run(
        currentSeq.tail ++ List(seq.head),
        seq.tail,
        prod,
        List(prod, maximumProd).max)
    }

    def run2(currentSeq: List[Char], seq: List[Char], maximumProd: BigInt): BigInt = {
      val prod: BigInt = currentSeq.map(_.asDigit).foldLeft(BigInt(1))((acc, x) => acc * x)

      seq.length match {
        case 0 => List(prod, maximumProd).max
        case _ =>
          run2(
            currentSeq.tail ++ List(seq.head), seq.tail, List(prod, maximumProd).max
          )
      }
    }

    val prod: BigInt = initialSeq.map(_.asDigit).foldLeft(BigInt(1))((acc, x) => acc * x)
    run(initialSeq, seq, prod, prod)
//    run2(initialSeq, seq, 0)
  }
  val initial = "7316717653133"
  val sequence = "062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"
//  val initial = "1234"
//  val sequence = "506782"
  println(maxProduct(initial.toList, sequence.toList))
}