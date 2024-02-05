package dataStructures.tree;

import java.util.ArrayList;
import java.util.List;

/*
Given the root of a binary tree, return the preorder traversal of its nodes' values.
 */
public class preorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        if(root==null) return list;

        list.add(root.val);

        if(root.left != null){
            list.addAll(preorderTraversal(root.left));
        }
        if(root.right != null){
            list.addAll(preorderTraversal(root.right));
        }
    return list;
    }
}
