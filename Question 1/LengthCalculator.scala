package com.knoldus.list

/**
  * Created by akhil on 24/1/17.
  */
class LengthCalculator {

  def calculateLength(list: List[Int]): Int= {      //calculating length of list

    val yieldList=for(element<-list)
      yield 1

    yieldList.foldRight(0)((m: Int, n: Int) => m + n)
  }
}
