package dataStructures.linkedList;
/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.
 */
/*
This question can easily be solved with two traversals: one for finding the length and the second for removing the desired node;
But, the trick is to do it with just one traversal.Two Pointers.
You set the distance between two nodes as the desired n and go until one reaches the end of the list
so the node we want is pointing from the second pointer and remove it.
We also Use a Dummy Node to ease and avoid edge cases. 
 */
 public class removeNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next=head;
        ListNode p1 = dummyNode;
        ListNode p2 = dummyNode;

        for(int i=0;i<n;i++){
            p1 = p1.next;
        }

        while(p1.next != null){
            p2 = p2.next;
            p1 = p1.next;
        }

        p2.next = p2.next.next;
        return dummyNode.next;
    }
}
