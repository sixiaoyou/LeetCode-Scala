package EighteenOne

/*
LeetCode657. Judge Route Circle
Initially, there is a Robot at position (0, 0). Given a sequence of its moves, judge if this robot makes a circle, which means it moves back to the original place.

The move sequence is represented by a string. And each move is represent by a character. The valid robot moves are R (Right), L (Left), U (Up) and D (down). The output should be true or false representing whether the robot makes a circle.

Example 1:
Input: "UD"
Output: true
Example 2:
Input: "LL"
Output: false
 */
/**
  * Created by You on 2018/1/3.
  */
object LeetCode657_JudgeRouteCircle {
  def judgeCircle(moves: String): Boolean = {
    var j = 0
    for(i <- moves){
      if(i == 'U' || i == 'R'){
        j+=1
      } else{
        j-=1
      }
    }
    j == 0
  }
}