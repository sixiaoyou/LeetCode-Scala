package EighteenOne

/**
  * Created by You on 2018/1/10.
  */
object LeetCode226_InvertBinaryTree {
  def postOrder(p:TreeNode):TreeNode={
    if(p!=null){
      postOrder(p.left)
      postOrder(p.right)
      val temp = p.left
      p.left = p.right
      p.right = temp
    }
    p
  }

  def invertTree(root: TreeNode): TreeNode = {
    postOrder(root)
    root
  }
}
