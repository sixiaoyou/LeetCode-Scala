package EighteenOne

/**
  * Created by You on 2018/1/13.
  */
object LeetCode453_MinimumMovestoEqualArrayElements {
  def minMoves(nums: Array[Int]): Int = {
    var count=0;
    var Nums = nums.sortWith(_<_);
    for(j<-0 until Nums.length-1){
      count+=Nums(j+1)-Nums(0);
    }
    return count;
  }
}
