package EighteenOne

/**
  * Created by You on 2018/1/11.
  */
object LeetCode462_MinimumMovestoEqualArrayElementsII {
  def minMoves2(nums: Array[Int]): Int = {
    var snums = nums.sortWith(_<_)
    var sum = 0
    val mid = snums(snums.length/2)
    for(i<-0 until snums.length){
      sum+=Math.abs(snums(i)-mid)
    }
    sum
  }
}
