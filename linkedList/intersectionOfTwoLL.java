package dataStructures.linkedList;
/*
Given the heads of two singly linked-lists headA and headB, 
return the node at which the two lists intersect.
 If the two linked lists have no intersection at all, return null.
 */

// The essence of this solution is to find the length of both ll's and try to gradually move forward until we reach
// intersection point 
public class intersectionOfTwoLL {

    public int getListLength(ListNode node){
        int counter=0;
        while(node != null){
            counter++;
            node = node.next;
        }
    return counter;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int len1 = getListLength(headA);
    int len2 = getListLength(headB);

    while(len1>len2){
        len1--;
        headA = headA.next;
    }

    while(len2>len1){
        len2--;
        headB = headB.next;
    }

    while(headA != headB){
        headA = headA.next;
        headB = headB.next;
    }
    return headA;
    }
}
