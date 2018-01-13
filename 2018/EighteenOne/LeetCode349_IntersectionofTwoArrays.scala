package EighteenOne

/**
  * Created by You on 2018/1/13.
  */
object LeetCode349_IntersectionofTwoArrays {
  import scala.collection.mutable
  def intersection(nums1: Array[Int], nums2: Array[Int]): Array[Int] = {
    val set1 = new mutable.HashSet[Int]
    for(num1 <- nums1){
      set1.add(num1)
    }
    val set2 = new mutable.HashSet[Int]
    for(num2 <- nums2){
      if(set1.contains(num2)){
        set2.add(num2)
      }
    }
    set2.toArray

  }
