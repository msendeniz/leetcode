package dataStructures.tree;

/*
Given two integer arrays inorder and postorder where inorder is the inorder traversal of a binary tree 
and postorder is the postorder traversal of the same tree, construct and return the binary tree.
*/

 /*
 The last element in the post order is the root of the tree.
  */

import java.util.HashMap;

public class constructFromInorder {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder ==null || postorder==null || postorder.length != inorder.length) {
            return null;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i], i);
        }

        return buildTreePostIn(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1, map);
    }

    public TreeNode buildTreePostIn(int[] inorder,int is,int ie, int[] postorder,int ps,int pe,HashMap<Integer,Integer> map){
        
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode root = new TreeNode(postorder[pe]);

        int inRoot = map.get(postorder[pe]);
        int numsOnLeft = inRoot-is;
        
        root.left = buildTreePostIn(inorder, is, inRoot-1, postorder, ps, ps+numsOnLeft-1, map);
        root.right = buildTreePostIn(inorder, inRoot+1, ie, postorder, ps+numsOnLeft, pe-1, map);

        return root;
    }
}
