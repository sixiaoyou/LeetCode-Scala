package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode476_NumberComplement {
  def findComplement(num: Int): Int = {
    return (Math.pow(2,Integer.toBinaryString(num).length) - 1 -num).toInt
  }
}
