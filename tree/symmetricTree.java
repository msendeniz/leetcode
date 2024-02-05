package dataStructures.tree;
/*
Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
 */
public class symmetricTree {
    boolean dfs(TreeNode left,TreeNode right){
         if(left==null && right==null) return true;

         if(left != null && right !=null){
            return (left.val == right.val &&
            dfs(left.left, right.right)&&
            dfs(left.right, right.left));
         }
         return false;

    }
    public boolean isSymmetric(TreeNode root) {

        return dfs(root.left, root.right);


    }
}
