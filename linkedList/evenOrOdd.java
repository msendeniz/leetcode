package dataStructures.linkedList;
/*
Given a linked list of size N, your task is to complete the function isLengthEvenOrOdd() 
which contains head of the linked list and check whether the length of linked list is even or odd.
returns 0 if the length of the linked list is even otherwise returns 1.
 */
public class evenOrOdd {
    int isLengthEvenorOdd(Node head1){

        if(head1==null){
            return 0;
        }
	    int counter=1;
        while(head1.next != null){
            head1 = head1.next;
            counter++;
        }

        return (counter%2 !=0) ? 1 :0;
	}
}
