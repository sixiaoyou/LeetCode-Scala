package EighteenOne
import scala.util.control._
/**
  * Created by You on 2018/1/13.
  */
object LeetCode492_ConstructtheRectangle {
  def constructRectangle(area: Int): Array[Int] = {
    val returnArray=new Array[Int](2);
    val sqrt=Math.sqrt(area).toInt;
    val loop = new Breaks;
    loop.breakable{
      for(i<- (1 until sqrt+1).reverse){
        if(area%i==0){
          returnArray(0)=area/i;
          returnArray(1)=i;
          loop.break;
        }
      }
    }
    return returnArray;
  }
}
