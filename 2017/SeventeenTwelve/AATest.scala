package SeventeenTwelve
import scala.util.control._
/**
  * Created by You on 2017/12/26.
  */
object AATest {
  def main(args:Array[String]){
    val loop = new Breaks;
    val nums = Array(1,2,2,1)
    val map = scala.collection.mutable.Map[Int, Int]()
    var temp = -1
    loop.breakable{
    for (num <- nums)
      if (map.contains(num)) {
        temp = num
        print(num)
        loop.break
      } else {
        map += (num -> num)
      }
    }
//    print(temp)
  }
}
