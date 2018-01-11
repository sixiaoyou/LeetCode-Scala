package SeventeenTwelve

/*
Follow up for "Find Minimum in Rotated Sorted Array":
What if duplicates are allowed?

Would this affect the run-time complexity? How and why?
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array may contain duplicates.
*/
/**
  * Created by You on 2017/12/30.
  */
object LeetCode154_FindMinimumInRotatedSortedArrayII {
  def findMin1(nums: Array[Int]): Int = {
    var (lo,ho) = (0,nums.length-1)
    var m = 0
    while(lo < ho){
      m = lo+(ho - lo)/2
      if(nums(m)<nums(ho)){
        ho = m
      }else if(nums(m)>nums(ho)){
        lo = m+1
      }else{
        ho-=1
      }
    }
    return nums(lo)
  }

  def findMin2(nums: Array[Int]): Int = {
    return nums.min
  }
}
