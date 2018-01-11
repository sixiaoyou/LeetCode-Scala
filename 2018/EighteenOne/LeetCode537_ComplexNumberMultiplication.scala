package EighteenOne

/*
Given two strings representing two complex numbers.

You need to return a string representing their multiplication. Note i2 = -1 according to the definition.

Example 1:
Input: "1+1i", "1+1i"
Output: "0+2i"
Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
Example 2:
Input: "1+-1i", "1+-1i"
Output: "0+-2i"
Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
Note:

The input strings will not have extra blank.
The input strings will be given in the form of a+bi, where the integer a and b will both belong to the range of [-100, 100]. And the output should be also in this form.

 */

/**
  * Created by You on 2018/1/3.
  */
object LeetCode537_ComplexNumberMultiplication {
  def complexNumberMultiply(a: String, b: String): String = {
    val c=a.split('+')
    val d=b.split('+')
    val (a1,a2)=(c(0).toInt,c(1).substring(0,c(1).length-1).toInt)
    val (b1,b2)=(d(0).toInt,d(1).substring(0,d(1).length-1).toInt)
    val (c1,c2)=(a1*b1-a2*b2,a1*b2+a2*b1)
    c1.toString+"+"+c2.toString+"i"
  }
}
