package dataStructures.tree;

import java.util.LinkedList;
import java.util.List;

/*
For the purposes of this challenge, we define a binary search tree to be a binary tree with the following properties:

The  value of every node in a node's left subtree is less than the data value of that node.
The  value of every node in a node's right subtree is greater than the data value of that node.
The  value of every node is distinct.
For example, the image on the left below is a valid BST. The one on the right fails on several counts:
- All of the numbers on the right branch from the root are not larger than the root.
- All of the numbers on the right branch from node 5 are not larger than 5.
- All of the numbers on the left branch from node 5 are not smaller than 5.
- The data value 1 is repeated.
 */
public class validateBST {

    /*
    We have to apply in-order traversal
     */
    boolean checkBST(Node root) {
        List<Integer> inOrderList = new LinkedList<>();
        fillTheList(root, inOrderList);

        if(inOrderList.isEmpty()) return true;

        int prevVal = inOrderList.get(0);
        for(int i=1;i<inOrderList.size();i++){
            if(inOrderList.get(i) <= prevVal){
                return false;
            }

            prevVal = inOrderList.get(i);
        }
    return true;
    }


    void fillTheList(Node node, List<Integer> inOrderList){

        if(node==null) return;

        fillTheList(node.left, inOrderList);
        inOrderList.add(node.val);
        fillTheList(node.right, inOrderList);

    }
}
