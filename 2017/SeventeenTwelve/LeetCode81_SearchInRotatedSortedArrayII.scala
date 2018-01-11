package SeventeenTwelve
/*
LeetCode81. Search in Rotated Sorted Array II
Follow up for "Search in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Write a function to determine if a given target is in the array.

The array may contain duplicates.
 */

/**
  * Created by You on 2017/12/30.
  */
object LeetCode81_SearchInRotatedSortedArrayII {
  def search1(nums: Array[Int], target: Int): Boolean = {
    var (low,high) = (0,nums.length-1)
    while(low<=high){
      var mid = (high+low)/2
      if(nums(mid)==target){
        return true
      }else if(nums(mid)>=nums(low)){
        if(nums(low)<=target&target<=nums(mid)){
          high-=1
        }else{
          low+=1
        }
      }else{
        if(nums(mid)<=target&target<=nums(high)){
          low+=1
        }else{
          high-=1
        }
      }
    }
    false
  }

  def search2(nums: Array[Int], target: Int): Boolean = {
    return nums.contains(target)
  }
}
