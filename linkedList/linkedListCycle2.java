package dataStructures.linkedList;
/*
Given the head of a linked list, return the node where the cycle begins. If there is no cycle, return null.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. 
Internally, pos is used to denote the index of the node that tail's next pointer is connected to (0-indexed). 
It is -1 if there is no cycle. Note that pos is not passed as a parameter.
Do not modify the linked list.
Input: head = [1,2], pos = 0
Output: tail connects to node index 0
Explanation: There is a cycle in the linked list, where tail connects to the first node.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

/*
 * Ok, the solution requires using a Tortoise and Hare algo in which you use 2 pointers
 * One is fast.One slow.
 * Fast moves in 2x speed of the slow and we find the place where they meet.
 * Then, reset the fast node to the head and move it one by one.
 * The place where they meet again, is the starting node of the cycle.
 */
public class linkedListCycle2 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            //When they meet for the first time, we reset the fast to head
            if(slow==fast){
                fast = head;
                while(fast != slow){
                    fast = fast.next;
                    slow = slow.next;
                }
            return fast;
            }
        }
    return null;
    }
}
