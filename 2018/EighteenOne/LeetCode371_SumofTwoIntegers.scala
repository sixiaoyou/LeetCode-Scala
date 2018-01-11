package EighteenOne

/**
  * Created by You on 2018/1/11.
  */
object LeetCode371_SumofTwoIntegers {
  def getSum(a: Int, b: Int): Int = {
    var c = 0
    var B = b
    var A = a

    while(B!=0){
      c=A^B
      B=(A&B)<<1
      A=c
    }
    A
  }
}
