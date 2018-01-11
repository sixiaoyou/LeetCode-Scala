import scala.util.control._
package EighteenOne



/**
  * Created by You on 2018/1/10.
  */
object LeetCode419_BattleshipsInABoard {
  def countBattleships(board: Array[Array[Char]]): Int = {
    val h = board.length
    val w = board(0).length
    val loop = new Breaks
    var sum = 0
    for(i<- 0 until h;j<- 0 until w){
      loop.breakable{
        if(board(i)(j)=='X'){
          if(i>0 && board(i-1)(j) == 'X'){
            loop.break
          }
          if(j>0 && board(i)(j-1) == 'X'){
            loop.break
          }
          sum+=1
        }
      }
    }
    sum
  }
}
