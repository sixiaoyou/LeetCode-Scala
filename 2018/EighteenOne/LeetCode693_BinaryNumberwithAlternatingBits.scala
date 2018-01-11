package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode693_BinaryNumberwithAlternatingBits {
  return !Integer.toBinaryString(n).contains("00") && !Integer.toBinaryString(n).contains("11");
}
