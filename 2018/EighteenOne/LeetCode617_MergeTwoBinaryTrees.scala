package EighteenOne

/**
  * Created by You on 2018/1/11.
  */

/**
  * Created by You on 2018/1/10.
  */
/**
  * Definition for a binary tree node.
  * class TreeNode(var _value: Int) {
  *   var value: Int = _value
  *   var left: TreeNode = null
  *   var right: TreeNode = null
  * }
  */

object LeetCode617_MergeTwoBinaryTrees {
  def mergeTrees(t1: TreeNode, t2: TreeNode): TreeNode = {
    if(t1 == null){
      return t2
    }
    if(t2 == null){
      return t1
    }
    t1.left = mergeTrees(t1.left,t2.left)
    t1.right = mergeTrees(t1.right,t2.right)
    t1.value+=t2.value
    t1
  }
}

