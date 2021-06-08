package com.stackqueue.Stack_Queue_Programs;

public interface INode<K> {

	// Creating a Interface for K and INode
	
	K getKey();
	
	void setKey(K key);

	INode<K> getNext();

	void setNext(INode<K> next);
}
