package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode647_PalindromicSubstrings {
  def isPalindromicString(s: String): Boolean = {
    var(start,end) = (0,s.length()-1)
    while(start<end){
      if(s.charAt(start)!=s.charAt(end)){
        return false
      }
      start+=1
      end-=1
    }
    return true
  }

  def countSubstrings(s: String): Int = {
    var length = s.length()
    var count =  length
    for(i<-1 until length){
      var start = 0
      var end = i
      while(end!=length){
        if(isPalindromicString(s.substring(start,end+1))){
          count+=1
        }
        start+=1
        end+=1
      }
    }
    count
  }
}
