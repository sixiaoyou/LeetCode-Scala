package EighteenOne

/**
  * Created by You on 2018/1/13.
  */
object LeetCode477_TotalHammingDistance {
  def totalHammingDistance(nums: Array[Int]): Int = {
    var sum=0;
    var count=0;
    for(i <- 0 until 32){
      count=0;
      for(j<-nums){
        count+=(j>>i)&1;
      }
      sum+=count*(nums.length-count);
    }
    sum;
  }
}
