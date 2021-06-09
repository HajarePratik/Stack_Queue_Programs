package com.stackqueue.Stack_Queue_Programs;

public class Queue {

	
	private final LinkedList myLinkedList;

    public Queue() {
        this.myLinkedList=new LinkedList();
    }

    // this method for insertion
    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
    }
    
    // this method for deletion
    public void dequeue() {
        myLinkedList.pop();
    }
    
    // This method will print the nodes.
    public void printQueue() {
        myLinkedList.printMyNodes();
    }
    
    
    // This method will return first value
    public INode peak() {
        return myLinkedList.head;
    }
    
}
