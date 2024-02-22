package dataStructures.tree;

/*
For the purposes of this challenge, we define a binary search tree to be a binary tree with the following properties:
The  value of every node in a node's left subtree is less than the data value of that node.
The  value of every node in a node's right subtree is greater than the data value of that node.
The  value of every node is distinct.
 */


/*
Solution
If the current node is null, we have to return true, as it makes a BST
Our node's value has to be strictly inside the boundaries
When going left, the left boundary doesn't change 
But when going right, our left boundary is updated as our root's value
 */
public class checkBST {

    public static boolean validate(TreeNode root,long left,long right){
        if(root==null) return true;
        if(!(root.val<right && root.val >left)) return false;

        return validate(root.left, left, root.val) && validate(root.right, root.val, right);
    }

    public static boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE,Long.MAX_VALUE);
    }


        public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        System.out.println(isValidBST(root));

    }
}
