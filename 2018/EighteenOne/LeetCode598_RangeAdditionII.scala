package EighteenOne

/**
  * Created by You on 2018/1/13.
  */
object LeetCode598_RangeAdditionII {
  def maxCount(m: Int, n: Int, ops: Array[Array[Int]]): Int = {
    var M = m
    var N = n
    for(i<-ops){
      if(i(0) < M){
        M = i(0);
      }
      if(i(1) < N){
        N = i(1);
      }
    }
    return M*N;
  }
}
