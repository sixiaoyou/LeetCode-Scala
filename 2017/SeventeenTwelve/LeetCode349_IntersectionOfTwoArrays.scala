package SeventeenTwelve

import scala.collection.mutable
/*
LeetCode349_IntersectionOfTwoArrays
Given two arrays, write a function to compute their intersection.

Example:
Given nums1 = [1, 2, 2, 1], nums2 = [2, 2], return [2].

Note:
Each element in the result must be unique.
The result can be in any order.
 */

/**
  * Created by Administrator on 2017/12/24.
  */
object LeetCode349_IntersectionOfTwoArrays {
  def intersectionV1(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {

    nums1.intersect(nums2).distinct
  }

//  网友实现
  def intersectionV2(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val set1 = new mutable.HashSet[Int]
    for(num1 <- nums1){
      set1.add(num1)
    }
    val set2 = new mutable.HashSet[Int]
    for(num2 <- nums2){
      if(set1.contains(num2)){
        set2.add(num2)
      }
    }
    set2.toArray


  }

}
