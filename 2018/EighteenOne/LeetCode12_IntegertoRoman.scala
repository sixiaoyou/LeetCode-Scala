package EighteenOne

/*
LeetCode12. Integer to Roman
Given an integer, convert it to a roman numeral.

Input is guaranteed to be within the range from 1 to 3999.
 */

/**
  * Created by You on 2018/1/3.
  */
object LeetCode12_IntegertoRoman {
  def intToRoman(num: Int): String = {
    val M = Array("", "M", "MM", "MMM");
    val C = Array("", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM");
    val X = Array("", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC");
    val I = Array("", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX");
    return M(num/1000) + C((num%1000)/100) + X((num%100)/10) + I(num%10);
  }
}
