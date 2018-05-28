package EighteenFive

/**
  * Created by You on 2018/5/28.
  *
  * LeetCode165. Compare Version Numbers
  * Compare two version numbers version1 and version2.
  * If version1 > version2 return 1; if version1 < version2 return -1;otherwise return 0.
  * *
  * You may assume that the version strings are non-empty and contain only digits and the . character.
  * The . character does not represent a decimal point and is used to separate number sequences.
  * For instance, 2.5 is not "two and a half" or "half way to version three", it is the fifth second-level revision of the second first-level revision.
  * *
  * Example 1:
  * *
  * Input: version1 = "0.1", version2 = "1.1"
  * Output: -1
  * Example 2:
  * *
  * Input: version1 = "1.0.1", version2 = "1"
  * Output: 1
  * Example 3:
  * *
  * Input: version1 = "7.5.2.4", version2 = "7.5.3"
  * Output: -1
  *
  */
object LeetCode165_CompareVersionNumbers {
  def compareVersion(version1: String, version2: String): Int = {
    val l1 = version1.split("\\.")
    val l2 = version2.split("\\.")
    var (a, b) = (0, 0)
    for (i <- 0 until Math.max(l1.length, l2.length)) {
      if (i < l1.length) {
        a = Integer.parseInt(l1(i))
      } else {
        a = 0
      }

      if (i < l2.length) {
        b = Integer.parseInt(l2(i))
      } else {
        b = 0
      }
      if (a < b) return -1
      if (a > b) return 1

    }
    return 0
  }
}
