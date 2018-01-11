package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode413_ArithmeticSlices {
  def numberOfArithmeticSlices(A: Array[Int]): Int = {
    var (length,count,start) = (A.length,0,0)
    for(i<- 0 until length){
      start = i+2
      while(start<length&&A(start)==A(i)+(start-i)*(A(i+1)-A(i))){
        start+=1
        count+=1

      }
    }
    count
}
