package EighteenOne

/**
  * Created by You on 2018/1/11.
  */
object LeetCode672_BulbSwitcherII {
  def flipLights(n: Int, m: Int): Int = {
    if (m * n == 0) return 1;
    if (n == 1) return 2;
    if (n == 2) return 4 - (m % 2);
    if (m == 1) return 4;
    if (m == 2) return 7;
    return 8;
  }
}
