package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode260_SingleNumberIII {
  def singleNumber(nums: Array[Int]): Array[Int] = {
    val array = Array(0,0)
    var xor = nums(0)
    for(i<-1 until nums.length){
      xor^=nums(i)
    }
    val lowBit = xor & -xor
    for(j<-0 until nums.length){
      if((nums(j)&lowBit)==0){
        array(0)^=nums(j)
      }else{
        array(1)^=nums(j)
      }
    }
    array
  }
}
