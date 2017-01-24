package com.knoldus.akhil

/* Q3. Write a function that concatenates a list of lists into a single list. Its runtime should be linear in the total length of all lists. The signature of the method should be:
 * def concateList[A](l1:List[A],l2:List[A]):List[A]
 * (Note: You can use Pattern matching over lists to implement the method. But, do not use any provided methods as solutions)*/

class Main {

}


object Main {

  def main(args: Array[String]): Unit = {

    val listConcator = new ListConcator

    val list1=List(1,2,3,4)
    val list2=List(5,6,7,8,9)

    println(listConcator.concateList(list1,list2))
  }

}
