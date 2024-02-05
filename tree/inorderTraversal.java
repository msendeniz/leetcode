package dataStructures.tree;

import java.util.ArrayList;
import java.util.List;
/*
Given the root of a binary tree, return the inorder traversal of its nodes' values.
 */
public class inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null) return list;

        if(root.left != null){
            list.addAll(inorderTraversal(root.left));
        }
        list.add(root.val);
        if(root.right != null){
            list.addAll(inorderTraversal(root.right));

        }
        return list;
    }
}
