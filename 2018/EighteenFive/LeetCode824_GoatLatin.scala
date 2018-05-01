package EighteenFive

/**
  * Created by You on 2018/5/1.
  */

/*
A sentence S is given, composed of words separated by spaces. Each word consists of lowercase and uppercase letters only.

We would like to convert the sentence to "Goat Latin" (a made-up language similar to Pig Latin.)

The rules of Goat Latin are as follows:

If a word begins with a vowel (a, e, i, o, or u), append "ma" to the end of the word.
For example, the word 'apple' becomes 'applema'.

If a word begins with a consonant (i.e. not a vowel), remove the first letter and append it to the end, then add "ma".
For example, the word "goat" becomes "oatgma".

Add one letter 'a' to the end of each word per its word index in the sentence, starting with 1.
For example, the first word gets "a" added to the end, the second word gets "aa" added to the end and so on.
Return the final sentence representing the conversion from S to Goat Latin.



Example 1:

Input: "I speak Goat Latin"
Output: "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
Example 2:

Input: "The quick brown fox jumped over the lazy dog"
Output: "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa ogdmaaaaaaaaaa"


Notes:

S contains only uppercase, lowercase and spaces. Exactly one space between each word.
1 <= S.length <= 150.

 */
object LeetCode824_GoatLatin {
  def isExisted(C: Character): Boolean = {
    val cs = Array('a','e','i','o','u','A','E','I','O','U')
    for(c<-cs){
      if(c==C){
        return true
      }
    }
    return false
  }


  def toGoatLatin(S: String): String = {
    var sb: StringBuilder = new StringBuilder
    val ls = S.split(" ")
    for(i<- 0 until ls.length){
      if(!isExisted(ls(i).charAt(0))){
        ls(i) = ls(i).substring(1,ls(i).length)+ls(i).substring(0,1)
      }
      sb.append(ls(i))
      sb.append("ma")
      for(j<-0 until i+1){
        sb.append("a")
      }
      if(i!=ls.length-1){
        sb.append(" ")
      }
    }
    return sb.toString()
  }
}
