package dataStructures.linkedList;

/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 */
/*
Use two pointers to seperate the LL from its middle and reverse the second half and check whether it's palindrome or not.
 */
public class palindromeLinkedList {
    public ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        ListNode front;

        while(curr != null){
            front = curr.next;
            curr.next = prev;
            prev = curr;
            curr = front;
        }

    return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head,fast=head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){
            slow = slow.next;
        }

        slow = reverseList(slow);
        fast = head;

        while(slow != null){
            if(slow.val != fast.val){
                return false;
            }

            slow=slow.next;
            fast = fast.next;
        }
        return true;
    }
}
