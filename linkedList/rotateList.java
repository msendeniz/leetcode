package dataStructures.linkedList;
/*
Given the head of a linked list, rotate the list to the right by k places.
 */
public class rotateList {

    public ListNode findNode(ListNode node,int k){
        int counter=1;
        while(node!=null){
            if(counter==k) return node;
            counter++;
            node = node.next;
        }
        return node;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        
        ListNode tail = head;
        int length=1;

        while(tail.next != null){
            tail = tail.next;
            length++;
        }
        
        if(k%length==0){
            return head;
        }

            k=k%length;
            tail.next=head;

            ListNode newLast = findNode(head, length-k);

            head = newLast.next;
            newLast.next = null;
        

        return head;
    }
}
