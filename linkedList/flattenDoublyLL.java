package dataStructures.linkedList;

/*
You are given a doubly linked list, which contains nodes that have a next pointer, a previous pointer, and an additional child pointer.
This child pointer may or may not point to a separate doubly linked list, also containing these special nodes.
These child lists may have one or more children of their own, and so on, to produce a multilevel data structure as shown in the example below.
Given the head of the first level of the list, flatten the list so that all the nodes appear in a single-level, doubly linked list.
Let curr be a node with a child list. The nodes in the child list should appear after curr and before curr.next in the flattened list.
Return the head of the flattened list. The nodes in the list must have all of their child pointers set to null.
 */

// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};

public class flattenDoublyLL {
    public Node flatten(Node head) {
        if (head==null) {
            return null;
        }
        Node tail = head;
        Node temp = null;
        Node cur = head;

        while(tail.next != null){
            tail = tail.next;
        }

        //traverse until we reach the tail
        while(cur != tail){
            if(cur.child != null){
                tail.next = cur.child;
                
                temp = cur.child;
                while(temp.next != null){
                    temp = temp.next;
                }
                tail = temp;
            }
            cur = cur.next;
        }
    return head;    
    }


}
