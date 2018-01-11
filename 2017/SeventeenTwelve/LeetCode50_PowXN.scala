package SeventeenTwelve

/*
LeetCode50. Pow(x, n)
Implement pow(x, n).


Example 1:

Input: 2.00000, 10
Output: 1024.00000
Example 2:

Input: 2.10000, 3
Output: 9.26100
 */
/**
  * Created by You on 2017/12/31.
  */
object LeetCode50_PowXN {
  def pow(x: Double, n: Int): Double = {
    var X = x
    if (n == 0) {
      return 1
    } else {
      var half = pow(x, n / 2)
      if (n % 2 == 0) {
        X = half * half
      } else {
        X = half * half * x
      }
    }
    X
  }


  def myPow(x: Double, n: Int): Double = {
    if (n == 0) {
      return 1
    } else if (n == 1) {
      return x
    } else {
      if (n > 0) {
        return pow(x, n)
      } else {
        return 1 / pow(x, -n)
      }
    }
  }
}
