package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode566_ReshapetheMatrix {
  def matrixReshape(nums: Array[Array[Int]], r: Int, c: Int): Array[Array[Int]] = {
    val (m,n) = (nums.length,nums(0).length)
    if (m*n!= r*c) return nums
    val res = Array.ofDim[Int](r,c)
    for(i<-0 until r*c){
      res(i/c)(i%c) = nums(i/n)(i%n)
    }
    res
  }
}
