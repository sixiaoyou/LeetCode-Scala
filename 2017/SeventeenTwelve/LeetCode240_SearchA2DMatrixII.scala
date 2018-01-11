package SeventeenTwelve
/*
LeetCode240. Search a 2D Matrix II
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted in ascending from left to right.
Integers in each column are sorted in ascending from top to bottom.
For example,

Consider the following matrix:

[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
Given target = 5, return true.

Given target = 20, return false.
 */
/**
  * Created by You on 2017/12/29.
  */
object LeetCode240_SearchA2DMatrixII {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    if(matrix.length == 0 || matrix(0).length == 0){
      return false
    }else{
      val m = matrix.length
      val n = matrix(0).length
      var row = 0
      var col = n - 1
      while(row<m&&col>=0){
        if(target==matrix(row)(col)){
          return true
        }else if(target>matrix(row)(col)){
          row+=1
        }else{
          col-=1
        }
      }
      return false
    }
  }
}
