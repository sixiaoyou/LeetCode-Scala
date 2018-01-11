package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode540_SingleElementinASortedArray {
  def singleNonDuplicate(nums: Array[Int]): Int = {
    var (start,end) = (0,nums.length-1)
    while(start<end){
      val mid = (start+end)/2
      if(nums(mid)==nums(mid^1)){
        start = mid+1
      }else{
        end = mid
      }
    }

    nums(start)
  }
}
