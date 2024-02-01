package dataStructures.linkedList;

import java.util.HashSet;

/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
 */
  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int x) {
          val = x;
          next = null;
      }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      
  }

public class linkedListCycle {
    //Using the two pointer technique
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
    return false;
    }
    // Second method with using HashSet
    public boolean hasCycleHashMap(ListNode head){
        ListNode temp =head;
        HashSet<ListNode> set = new HashSet<>();

        while(temp.next != null){
            if(set.contains(temp)){
                return false;
            }else{
                set.add(temp);
            }

            temp = temp.next;
        }
    return true;
    }

    
}
