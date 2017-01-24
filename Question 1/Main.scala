
import com.knoldus.list.LengthCalculator


/*Q1. Compute the length of a list using method foldRight. The signature of the method should be:
 *   def length[A](l: List[A]): Int
 *   (Note: Do not use length method provided in the scala library)*/


class Main {

}

object Main{

  def main(args: Array[String]): Unit = {

    val list=List(1,2,3,4,5,6)
    val obj=new LengthCalculator

    println(obj.calculateLength(list))
  }

}
