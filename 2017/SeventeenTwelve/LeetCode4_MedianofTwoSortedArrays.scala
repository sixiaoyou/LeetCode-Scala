package SeventeenTwelve

import scala.collection.mutable.ArrayBuffer
/*
leetCode4 Median of Two Sorted Arrays
  There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

Example 1:
nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:
nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5
   */
/**
  * Created by You on 2017/12/31.
  */
object LeetCode4_MedianofTwoSortedArrays {
  def findMedianSortedArrays(nums1: Array[Int], nums2: Array[Int]): Double = {
    var nums = ArrayBuffer[Int]()
    for(i<-nums1){
      nums+=i
    }
    for(j<-nums2){
      nums+=j
    }
    nums = nums.sortWith(_<_)
    if(nums.length%2==0){
      return (nums(nums.length/2)+nums(nums.length/2-1))/2.0
    }else{
      return nums(nums.length/2)
    }
  }
}
