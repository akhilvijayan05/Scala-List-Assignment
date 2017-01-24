package com.knoldus.akhil

import scala.collection.mutable.ListBuffer


class ListSplitter {

  def splitList[A](list:  List[A],f: A=>Boolean): (List[A],List[A]) = {    //Splitting a list into two based on the boolean function
    val list1 = ListBuffer[A]()
    val list2 = ListBuffer[A]()

    list.foreach( element => if(f(element)) {
      list1 += element
    } else {
      list2 += element
    }
    )
    (list1.toList, list2.toList)
  }

}
