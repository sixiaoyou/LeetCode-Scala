package EighteenOne

/*
LeetCode11. Container With Most Water
Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

Note: You may not slant the container and n is at least 2.
 */


/**
  * Created by You on 2018/1/3.
  */
object LeetCode11_ContainerWithMostWater {
  def maxArea(height: Array[Int]): Int = {
    var (max1, l, r) = (0, 0, height.length - 1)
    while (l < r) {
      max1 = math.max(max1, math.min(height(l), height(r)) * (r - l))
      if (height(l) < height(r)) {
        l += 1
      } else {
        r -= 1
      }
    }
    max1
  }
}
