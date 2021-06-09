package com.stackqueue.Stack_Queue_Programs;

public class Queue {

	
	private final LinkedList myLinkedList;

    public Queue() {
        this.myLinkedList=new LinkedList();
    }

    public void enqueue(INode myNode) {
        myLinkedList.append(myNode);
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
