package EighteenThree

/**
  * Created by You on 2018/3/25.
  */
/*
LeetCode804. Unique Morse Code Words
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.

For convenience, the full table for the 26 letters of the English alphabet is given below:

[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.

Example:
Input: words = ["gin", "zen", "gig", "msg"]
Output: 2
Explanation:
The transformation of each word is:
"gin" -> "--...-."
"zen" -> "--...-."
"gig" -> "--...--."
"msg" -> "--...--."

There are 2 different transformations, "--...-." and "--...--.".
 */
import scala.collection.mutable.Set
import scala.collection.mutable.Map
object LeetCode804_UniqueMorseCodeWords {
  def uniqueMorseRepresentations(words: Array[String]): Int = {
    val a=Array('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z')
    val b=Array(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
    var map:Map[Char,String] = Map()
    var sBuilder =new StringBuilder()
    var set:Set[String] = Set()
    for(i<-0 until a.length){
      map(a(i))=b(i)
    }
    for(j<-0 until words.length){
      for(s<-0 until words(j).length){
        sBuilder.append(map(words(j)(s)))
      }
      set.add(sBuilder.toString())
      sBuilder =new StringBuilder()
    }
    set.size
  }
}
