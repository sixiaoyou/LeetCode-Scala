package SeventeenTwelve

/*
LeetCode74. Search a 2D Matrix
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

Integers in each row are sorted from left to right.
The first integer of each row is greater than the last integer of the previous row.
For example,

Consider the following matrix:

[
  [1,   3,  5,  7],
  [10, 11, 16, 20],
  [23, 30, 34, 50]
]
Given target = 3, return true.
 */

/**
  * Created by You on 2017/12/31.
  */
//【网友实现】
object LeetCode74_Searcha2DMatrix {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    if(matrix.length==0){
      return false
    }
    val(row,col) = (matrix.length,matrix(0).length)
    if(col == 0){
      return false
    }
    val size = row * col
    var (start,end) = (0,size-1)
    while(start<=end){
      var mid = start+(end-start)/2
      var (rowInd,colInd) = (mid/col,mid%col)
      if(matrix(rowInd)(colInd)<target){
        start=mid+1
      }else if(matrix(rowInd)(colInd)>target){
        end = mid - 1
      }else{
        return true
      }
    }
    return false
  }
}
