package com.stackqueue.Stack_Queue_Programs;


// Creating a New Class To Define Stack Opration
public class Stack 
{
	private final LinkedList linkedList;

	public Stack() {
		this.linkedList = new LinkedList();	
	}

	public void push(INode myNode) {
		linkedList.add(myNode);
	}
	
	public INode pop() {
		return linkedList.pop();
	}

	public INode peak() {
		// TODO Auto-generated method stub
		return linkedList.head;
	}

	public void printStack()
	{
		linkedList.printMyNodes();
	}

}
