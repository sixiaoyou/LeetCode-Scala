package EighteenOne

/**
  * Created by You on 2018/1/13.
  */
object LeetCode_171ExcelSheetColumnNumber {
  def titleToNumber(s: String): Int = {
    var sum=0;
    val charS: Array[Char]= s.toCharArray;
    for(i<- 0 until charS.length){
      sum+=(charS(i).toInt-64)*(Math.pow(26,charS.length-i-1)).toInt;
    }
    return sum;
  }
}
