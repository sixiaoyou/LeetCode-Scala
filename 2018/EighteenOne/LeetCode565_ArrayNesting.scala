package EighteenOne

/**
  * Created by You on 2018/1/11.
  */
object LeetCode565_ArrayNesting {
  def Search(nums: Array[Int],idx: Int): Int = {
    var count=0;
    var Idx = idx
    while(nums(Idx)>=0){
      var next = nums(Idx);
      nums(Idx) = -1;
      Idx = next;
      count+=1;
    }
    return count;
  }


  def arrayNesting(nums: Array[Int]): Int = {
    var ans = 0;
    for(i<-0 until nums.length){
      if(nums(i)>=0){
        ans=Math.max(ans,Search(nums,i));
      }
    }
    return ans;
  }
}
