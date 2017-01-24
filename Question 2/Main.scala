package com.knoldus.list

/*
* Q2. Implement a method hasSubsequence for checking whether a List contains another List as a subsequence. For instance, List(1,2,3,4) would have List(1,2), List(2,3), and List(4) as subsequences. The signature of the method should be:
*     def hasSubsequence[A](list:List[A],sub:List[A]):Boolean
* */
class Main {

}

object Main {

  def main(args: Array[String]): Unit = {
    val subsequence = new Subsequence
    println(subsequence.hasSubsequence(List(1,2,3,4,5,6,7),List(3,4,5)))


  }
}
