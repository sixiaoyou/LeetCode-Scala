package SeventeenTwelve
/*
LeetCode35. Search Insert Position
Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Example 1:

Input: [1,3,5,6], 5
Output: 2
Example 2:

Input: [1,3,5,6], 2
Output: 1
Example 3:

Input: [1,3,5,6], 7
Output: 4
Example 1:

Input: [1,3,5,6], 0
Output: 0

 */

/**
  * Created by You on 2017/12/28.
  */
object LeetCode35_SearchInsertPosition {
  def searchInsert(nums: Array[Int], target: Int): Int = {
    if(target<nums(0)){
      return 0
    }else{

      for(i<-0 until nums.length-1){
        if(target==nums(i)){
          return i
        }else if(target>nums(i)&&target<nums(i+1))
          return i+1
      }
      if(target==nums(nums.length-1)){
        return nums.length - 1;
      }else{
        return nums.length
      }
    }
  }
}
