package EighteenOne

import scala.collection.mutable.Stack


/**
  * Created by You on 2018/1/10.
  */
object LeetCode682_BaseballGame {
  def sum(numbers: Stack[Integer]): Int = {
    var sum = 0
    for(i<-numbers){
      sum+=i
    }
    return sum
  }


  def calPoints(ops: Array[String]): Int = {
    val numbers = Stack[Integer]();
    for(i<-ops){
      if(i == "C"){
        numbers.pop()
      }else if(i == "D"){
        numbers.push(numbers.head*2)
      }else if(i.equals("+")){
        val temp1 = numbers.pop
        val temp2 = numbers.head
        numbers.push(temp1)
        numbers.push(temp1+temp2)
      }else{
        numbers.push(i.toInt)
      }
    }
    sum(numbers)
  }
}
