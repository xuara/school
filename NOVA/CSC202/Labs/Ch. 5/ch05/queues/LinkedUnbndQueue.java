//---------------------------------------------------------------------------
// LinkedUnbndQueue.java         by Dale/Joyce/Weems                Chapter 5
//
// Implements UnboundedQueueInterface using a linked list
//---------------------------------------------------------------------------
package ch05.queues;

import support.LLNode;

public class LinkedUnbndQueue<T> implements UnboundedQueueInterface<T> {

    protected LLNode<T> front;   // reference to the front of this queue
    protected LLNode<T> rear;    // reference to the rear of this queue

    public LinkedUnbndQueue() {
        front = null;
        rear = null;
    }

    public void enqueue(T element) // Adds element to the rear of this queue.
    {
        LLNode<T> newNode = new LLNode<T>(element);
        if (rear == null) {
            front = newNode;
        } else {
            rear.setLink(newNode);
        }
        rear = newNode;
    }

    public T dequeue() // Throws QueueUnderflowException if this queue is empty;
    // otherwise, removes front element from this queue and returns it.
    {
        if (isEmpty()) {
            throw new QueueUnderflowException("Dequeue attempted on empty queue.");
        } else {
            T element;
            element = front.getInfo();
            front = front.getLink();
            if (front == null) {
                rear = null;
            }

            return element;
        }
    }

    public boolean isEmpty() // Returns true if this queue is empty; otherwise, returns false.
    {
        if (front == null) {
            return true;
        } else {
            return false;
        }
    }

    //Exercise 5.31B
    public T front() throws QueueUnderflowException {
        if (isEmpty()) {
            throw new QueueUnderflowException("Queue is empty.");
        }
        return front.getInfo();
    }

    //Exercise 5.32
    @Override
    public String toString() {
        String result = "";
        LLNode<T> curr = front;

        while (curr != null) {
            result = result + (curr.getInfo()).toString() + " ";
            curr = curr.getLink();
        }
        return result;
    }
}
