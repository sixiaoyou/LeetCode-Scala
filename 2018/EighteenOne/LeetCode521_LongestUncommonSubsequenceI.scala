package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode521_LongestUncommonSubsequenceI {
  def findLUSlength(a: String, b: String): Int = {
    if(a==b) -1 else Math.max(a.length(),b.length())
  }
}
