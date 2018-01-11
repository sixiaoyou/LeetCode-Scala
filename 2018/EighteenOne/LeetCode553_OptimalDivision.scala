package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode553_OptimalDivision {
  def optimalDivision(nums: Array[Int]): String = {
    val length = nums.length
    var s = ""
    if(length == 1){
      s =  nums(0).toString
    }else if(length == 2){
      s = nums(0).toString+"/"+nums(1).toString
    }else{
      for(i<-0 until length){
        if(i==0){
          s+=nums(i).toString+"/("
        }else if(i==length-1){
          s+=nums(i).toString+")"
        }else{
          s+=nums(i)+"/"
        }
      }
    }
    s

  }
}
