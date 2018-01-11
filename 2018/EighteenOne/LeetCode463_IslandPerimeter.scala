package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode463_IslandPerimeter {
  val h = grid.length
  var sum = 0
  var w = 0
  if(grid(0).length>0){
    w = grid(0).length
  }
  for(i<- 0 until h;j<- 0 until w){
    if(grid(i)(j) == 1){
      sum+=4
      if(i>0&&grid(i-1)(j)==1){
        sum-=2
      }
      if(j>0&&grid(i)(j-1)==1){
        sum-=2
      }
    }
  }
  sum
}
