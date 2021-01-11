package com.app.queue;

import java.util.Arrays;

public class CircularQueue implements QueueOperationInterface {

	int[] circularQueueArr;
	int rear, front, size;
	
	
	
	public CircularQueue(int size) {
		super();
		this.size = size;
		
		circularQueueArr = new int[size];
		
		front = rear = -1;
		
	}

	@Override
	public void push(int n) {

		if(isFull()) {
			System.out.println("Queue is full!");//it shouldn't be full any time though
		}
		
		circularQueueArr[++front % size] = n;//store element at value of incremented top % size of the queue.
		
	}

	@Override
	public int pop() {
		
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return -1;
		}
		
		int poppedElement = circularQueueArr[front];
		
		++rear;
		
		return poppedElement;
	}

	@Override
	public boolean isEmpty() {
		
		if(rear == front) {
			return true;
		}
		
		return false;
	}

	@Override
	public boolean isFull() {
		
		if(rear-1 == front) {
			return true;
		}
		
		return false;
	}

	public void printCircularQueue() {
		
			System.out.println(Arrays.toString(circularQueueArr));
	
	}
	
}
