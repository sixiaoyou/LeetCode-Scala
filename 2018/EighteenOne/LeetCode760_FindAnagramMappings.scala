package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode760_FindAnagramMappings {
  def anagramMappings(A: Array[Int], B: Array[Int]): Array[Int] = {
    val map: Map[Int,Int] = Map()
    val C = new Array[Int](A.length)
    for(i<-0 until B.length){
      map(B(i)) = i
    }
    for(j<-0 until A.length){
      if(map.contains(A(j))){
        C(j) = map(A(j))
      }
    }
    C
  }
}
