package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode561_ArrayPartitionI {
  def arrayPairSum(nums: Array[Int]): Int = {
    var vnums = nums.sortWith(_<_)
    var sum = 0
    for(i <- 0 until (vnums.length,2)){
      sum+=vnums(i)
    }
    sum
  }
}
