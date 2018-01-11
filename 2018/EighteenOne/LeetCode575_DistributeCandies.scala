package EighteenOne

import scala.collection.mutable.Set
/**
  * Created by You on 2018/1/10.
  */
object LeetCode575_DistributeCandies {
  def distributeCandies(candies: Array[Int]): Int = {
    val set = Set[Int]()
    for(i<-candies){
      set.add(i)
    }
    Math.min(candies.length/2,set.size)
  }
}
