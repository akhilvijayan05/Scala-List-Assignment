package com.knoldus.list

/**
  * Created by akhil on 24/1/17.
  */
class Subsequence {

  def hasSubsequence(list: List[Int], sub: List[Int]): Boolean = {   //checking whether a List contains another List as a subsequence

    val str1 = list.foldLeft("")((x,y) => x+y)
    val str2 = sub.foldLeft("")((x,y) => x+y)

    if(str1.indexOf(str2) >= 0)
      true
    else
      false

  }
}
