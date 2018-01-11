package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode485_MaxConsecutiveOnes {
  def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
    var(count,max) = (0,0)
    for(i<-nums){
      if(i==1){
        count+=1
      }else{
        max=Math.max(max,count)
        count=0
      }
    }
    Math.max(max,count)
  }
}
