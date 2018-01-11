package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode728_SelfDividingNumbers {
  def selfDividingNumbers(left: Int, right: Int): List[Int] = {
    var list = List[Int]()
    val loop = new Breaks
    for(i<-left until right+1){
      val j = i.toString
      var mark = true
      loop.breakable{
        for(k<-0 until j.length()){
          var temp = j.charAt(k)
          if(temp=='0' || i%(temp.toInt - 48) != 0){
            mark = false
            loop.break
          }
        }
      }
      if(mark) list:+=i
    }
    list
  }
}
