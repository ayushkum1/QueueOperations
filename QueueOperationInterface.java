package com.app.queue;

public interface QueueOperationInterface {

	public void push(int n);
	
	public int pop();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
}
