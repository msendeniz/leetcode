package dataStructures.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
Given the root of a binary tree, return the level order traversal of its nodes' values. (i.e., from left to right, level by level).
 */
/*
-Add the root to the queue
-Start processing the q until empty
    -Pop each element and print
    -Add the left child to queue
    -Add the right child to queue
 */


public class levelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> list = new ArrayList<>();
            if(root==null) return list;

            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                List<Integer> levelList = new ArrayList<>();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode curr = queue.poll();

                    levelList.add(curr.val);

                    if(curr.left != null){
                        queue.add(curr.left);
                    }
                    if(curr.right != null){
                        queue.add(curr.right);
                    } 
                }
                
            list.add(levelList);
            }
    
        return list;
        }
}
