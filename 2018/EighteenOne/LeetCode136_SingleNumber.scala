package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode136_SingleNumber {
  def singleNumber(nums: Array[Int]): Int = {
    var ans = 0
    for(i<-nums){
      ans^=i
    }
    ans


  }
}
