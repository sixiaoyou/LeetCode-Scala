package EighteenSix

/**
  * Created by You on 2018/6/17.
  /*
'''
LeetCode852. Peak Index in a Mountain Array
Let's call an array A a mountain if the following properties hold:

A.length >= 3
There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

Example 1:

Input: [0,1,0]
Output: 1
Example 2:

Input: [0,2,1,0]
Output: 1
Note:

3 <= A.length <= 10000
0 <= A[i] <= 10^6
A is a mountain, as defined above.
'''
  */
  */
object LeetCode852_PeakIndexinaMountainArray {
  def peakIndexInMountainArray(A: Array[Int]): Int = {
    var res = 0
    for(i<-1 until A.length-1){
      if(A(i)>A(i-1)&&A(i)>A(i+1)){
        res = i
      }
    }
    res
  }
}
