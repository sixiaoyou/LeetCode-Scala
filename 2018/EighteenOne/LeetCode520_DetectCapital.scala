package EighteenOne

/**
  * Created by You on 2018/1/11.
  */
object LeetCode520_DetectCapital {
  def detectCapitalUse(word: String): Boolean = {
    var lowerStr=word.toLowerCase();
    var upperStr=word.toUpperCase();
    var subStr=word.substring(1);
    var lowerSubStr=subStr.toLowerCase();
    var ok=false;

    if (word.equals(lowerStr) || word.equals(upperStr) || subStr.equals(lowerSubStr)){
      ok=true;
    }
    return ok;
  }
}
