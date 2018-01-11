package EighteenOne
import scala.util.control._
/**
  * Created by You on 2018/1/11.
  */
object LeetCode_389FindtheDifference {
  def findTheDifference(s: String, t: String): Char = {
    var charR='a';
    var ok=true;
    var charS = s.toCharArray();
    var charT = t.toCharArray();
    var scharS = charS.sortWith(_<_)
    var scharT = charT.sortWith(_<_)
    var loop = new Breaks
    loop.breakable{
      for(i<-0 until scharT.length-1){
        if(scharT(i)!=scharS(i)){
          charR=scharT(i);
          ok=false;
          loop.break;
        }
      }
    }
    if(ok){
      charR=scharT(scharT.length-1);
    }
    charR;
  }
}
