package EighteenOne

/**
  * Created by You on 2018/1/11.
  */
object LeetCode717_1bitand2bitCharacters {
  def isOneBitCharacter(bits: Array[Int]): Boolean = {
    var(lb,start) = (bits.length,0)
    while(start<lb){
      while(start<lb&&bits(start)==1){
        start+=2
      }
      start+=1
    }
    start == lb
  }
}
