package Deque;

import java.util.LinkedList;
import java.util.Queue;

public class FIFODeque<T> {


	    private Queue<T> queue1;
	    private Queue<T> queue2;

	    public FIFODeque() {
	        queue1 = new LinkedList<>();
	        queue2 = new LinkedList<>();
	    }

	    public void addFront(T item) {
	        queue2.add(item);
	        while (!queue1.isEmpty()) {
	            queue2.add(queue1.remove());
	        }
	        Queue<T> temp = queue1;
	        queue1 = queue2;
	        queue2 = temp;
	    }

	    public void addBack(T item) {
	        queue1.add(item);
	    }

	    public T removeFront() {
	        if (queue1.isEmpty()) {
	            throw new IllegalStateException("Deque is empty");
	        }
	        return queue1.remove();
	    }

	    public T removeBack() {
	        if (queue1.isEmpty()) {
	            throw new IllegalStateException("Deque is empty");
	        }
	        while (queue1.size() > 1) {
	            queue2.add(queue1.remove());
	        }
	        T removedItem = queue1.remove();
	        Queue<T> temp = queue1;
	        queue1 = queue2;
	        queue2 = temp;
	        return removedItem;
	    }

	    public boolean isEmpty() {
	        return queue1.isEmpty();
	    }

	    public int size() {
	        return queue1.size();
	    }

	    public void display() {
	        System.out.println("Current deque: " + queue1);
	    }

	    public static void main(String[] args) {
	        FIFODeque<Integer> deque = new FIFODeque<>();

	        deque.addFront(1);
	        deque.display();
	        deque.addBack(25);
	        deque.addFront(65);
	        deque.addFront(45);
	        deque.addBack(12);
	        deque.addFront(32);

	        System.out.println("Removed from front: " + deque.removeFront());
	        deque.display();
	        System.out.println("Removed from back: " + deque.removeBack());
	        deque.display();
	        System.out.println("Removed from front: " + deque.removeFront());
	        deque.display();
	    }
	}


