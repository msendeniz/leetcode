package dataStructures.queue;

import java.util.ArrayList;

/*
Design your implementation of the circular queue.
The circular queue is a linear data structure in which the operations are performed based on FIFO (First In First Out) principle, 
and the last position is connected back to the first position to make a circle. It is also called "Ring Buffer".

One of the benefits of the circular queue is that we can make use of the spaces in front of the queue. In a normal queue,
 once the queue becomes full, we cannot insert the next element even if there is a space in front of the queue. 
 But using the circular queue, we can use the space to store new values.
 */
public class circularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    public MyCircularQueue(int k) {
        size=k;
        queue = new int[size];
        front=-1;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        if (isEmpty()) {
            front=0;
        }
        rear = (rear+1) % size;
        queue[rear] =value;
        return true;
    }
    
    public boolean deQueue() {
      if (isEmpty()) {
        return false;
      }  
      if(front==rear){
        front= -1;
        rear = -1;
      }else{
        front=(front+1) % size;
      }

      return true;
    }
    
    public int Front() {
        if(isEmpty()){
            return -1;
        }
        return queue[front];
    }
    
    public int Rear() {
        if(isEmpty()){
            return -1;
        }
        return queue[rear];
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return ((rear+1) % size) == front;
    }
}
