package FIFOQueues;

import java.util.ArrayList;
import java.util.List;

public class FIFOQueueArrayList<T> {
	    private List<T> list;

	    public FIFOQueueArrayList() {
	        this.list = new ArrayList<>();
	    }

	    public void enqueue(T data) {
	        list.add(data);
	    }

	    public T dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return list.remove(0);
	    }

	    public T peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return list.get(0);
	    }

	    public boolean isEmpty() {
	        return list.isEmpty();
	    }

	    public int size() {
	        return list.size();
	    }

	    public static void main(String[] args) {
	        FIFOQueueArrayList<Integer> queue = new FIFOQueueArrayList<>();
	        queue.enqueue(15);
	        queue.enqueue(32);
	        queue.enqueue(43);
	        System.out.println("Queue size: " + queue.size());
	        System.out.println("Front element: " + queue.peek());
	        System.out.println("Removed element: " + queue.dequeue());
	        System.out.println("Queue size after removal: " + queue.size());
	        System.out.println("Front element after removal: " + queue.peek());
	        queue.enqueue(4);
	        System.out.println("Queue size after adding 4: " + queue.size());
	        System.out.println("Front element: " + queue.peek());
	    }
	}



