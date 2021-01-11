package com.app.queue;

public class Queue implements QueueOperationInterface {

	private int[] queueArr;
	private int front, rear, size;
	
	public Queue(int size) {
		super();
		this.size = size;
		
		queueArr = new int[size];//initialize the array with given size, front and top to -1 as queue is empty
		front = -1;
		rear = -1;
		
	}

	public int[] getQueueArr() {
		return queueArr;
	}

	public void printQueue() {
		
		if(isEmpty()) {
			System.out.println("Empty Queue!!");	
		}
		
		//rear+1 as rear index element would have been popped
		for(int i = rear+1; i <= front ; i++) {
			System.out.println(queueArr[i]);
		}
	}
	
	@Override
	public void push(int n) {

		if(isFull()) {
			System.out.println("Queue is Full!");
			return;
		}
		
		queueArr[++front] = n;
	
	}

	@Override
	public int pop() {
		
		if(isEmpty()) {
			return -1;
		}
		
		int poppedItem = queueArr[++rear];//increment the rear from -1 to 0 and so on, pass the value at rear(index) and return the popped element
		
		return poppedItem;
	}

	@Override
	public boolean isEmpty() {

		if(rear == front) { //if rear and front are equal, queue is empty
			return true;
		}
		
		return false;

	}

	@Override
	public boolean isFull() {
		
		if(front == size-1) { //checking if its full
			return true;
		}
		
		return false;

	}

}
