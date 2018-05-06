package EighteenFive

/**
  * Created by You on 2018/5/6.
  */
/*
In a string S of lowercase letters, these letters form consecutive groups of the same character.

For example, a string like S = "abbxxxxzyy" has the groups "a", "bb", "xxxx", "z" and "yy".

Call a group large if it has 3 or more characters.  We would like the starting and ending positions of every large group.

The final answer should be in lexicographic order.



Example 1:

Input: "abbxxxxzzy"
Output: [[3,6]]
Explanation: "xxxx" is the single large group with starting  3 and ending positions 6.
Example 2:

Input: "abc"
Output: []
Explanation: We have "a","b" and "c" but no large group.
Example 3:

Input: "abcdddeeeeaabbbcd"
Output: [[3,5],[6,9],[12,14]]


Note:  1 <= S.length <= 1000
 */
class LeetCode830_PositionsofLargeGroups {
  def largeGroupPositions(S: String): List[List[Int]] = {
    var dim: List[List[Int]] = List()
    var (start1,start2,end) = (0,0,S.length-1)
    while(start1<=end){
      while(start2+1<=end && S.charAt(start2+1)==S.charAt(start1)){
        start2+=1
      }
      if(start2-start1 >=2){
        dim = dim:+List(start1,start2)
      }
      start1=start2+1
    }

    dim
  }
}
