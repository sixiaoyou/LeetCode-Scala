package EighteenOne

/**
  * Created by You on 2018/1/11.
  */
object LeetCode495_TeemoAttacking {
  def findPoisonedDuration(timeSeries: Array[Int], duration: Int): Int = {
    var sum = 0
    for(i<-0 until timeSeries.length){
      if(i==0){
        sum+=duration
      }else if(timeSeries(i)-timeSeries(i-1)>=duration){
        sum+=duration
      }else{
        sum+=timeSeries(i)-timeSeries(i-1)
      }
    }
    sum
  }
}
