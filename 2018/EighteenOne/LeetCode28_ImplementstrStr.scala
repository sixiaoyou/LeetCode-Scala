package EighteenOne

/*
LeetCode28. Implement strStr()
Implement strStr().

Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.

Example 1:

Input: haystack = "hello", needle = "ll"
Output: 2
Example 2:

Input: haystack = "aaaaa", needle = "bba"
Output: -1
 */
/**
  * Created by You on 2018/1/3.
  */
object LeetCode28_ImplementstrStr {
  def strStr(haystack: String, needle: String): Int = {
    haystack.indexOf(needle)
  }
}
