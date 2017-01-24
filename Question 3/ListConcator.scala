package com.knoldus.akhil

import scala.collection.mutable.ListBuffer

/**
  * Created by akhil on 24/1/17.
  */
class ListConcator {

  def concateList[A](list1:List[A],list2:List[A]):List[A] = {   //Concating two list
    val listBuffer = ListBuffer[A]()

    list1.foreach(element => {
      listBuffer += element
    })

    list2.foreach(element => {
      listBuffer += element
    })

    listBuffer.toList
  }


}
