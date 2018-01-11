package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode104_MaximumDepthofBinaryTree {
  def maxDepth(root: TreeNode): Int = {
    if(root == null){
      return 0
    }else{
      return Math.max(maxDepth(root.left),maxDepth(root.right))+1
    }
  }
}
