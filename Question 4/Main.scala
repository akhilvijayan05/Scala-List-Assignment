package com.knoldus.akhil

/*Q4. Write a function that splits a list elements into a pair of lists on the basis of given boolean function. The signature of the method should be:
 *    def splitList[A](l:List[A],f:A=>Boolean):(List[A],List[B])
 *    (Note: Do not use method filter provided in the library)*/


class Main {

}

object Main {

  def main(args: Array[String]): Unit = {


    val listSplitter = new ListSplitter

    val (list1, list2) = listSplitter.splitList(List(1,2,3,4,5,6,7), checkEven(_))

    println(list1)
    println(list2)

  }

  def checkEven(number:Int) : Boolean = {
    if ( number % 2 == 0) true
    else false
  }
}
