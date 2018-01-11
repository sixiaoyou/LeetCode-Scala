package EighteenOne

/*
LeetCode14. Longest Common Prefix
Write a function to find the longest common prefix string amongst an array of strings.
 */
/**
  * Created by You on 2018/1/3.
  */
object LeetCode14_LongestCommonPrefix {
  def longestCommonPrefix(strs: Array[String]): String = {
    val result = new StringBuilder()
    var Strs = strs
    if (Strs != null && Strs.length > 0) {
      Strs = Strs.sortWith(_ < _)
      val a = Strs(0).toCharArray()
      val b = Strs(Strs.length - 1).toCharArray()
      for (i <- 0 until a.length) {
        if (b.length > i && b(i) == a(i)) {
          result.append(b(i))
        } else {
          return result.toString()
        }
      }
    }

    result.toString()
  }
}
