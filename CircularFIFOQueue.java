package CircularFIFOQueue ;
	
	
	public class CircularFIFOQueue<T> {
		
	    private T[] buffer;
	    private int front;
	    private int rear;
	    private int size;
	    private int capacity;

	
	    public CircularFIFOQueue(int capacity) {
	        this.capacity = capacity;
	        this.buffer = (T[]) new Object[capacity];
	        this.front = 0;
	        this.rear = 0;
	        this.size = 0;
	    }

	    // Adds an element to the rear of the queue
	    public void enqueue(T data) {
	        if (isFull()) {
	            throw new IllegalStateException("Queue is full");
	        }
	        buffer[rear] = data;
	        rear = (rear + 1) % capacity;
	        size++;
	    }

	    public T dequeue() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        T data = buffer[front];
	        buffer[front] = null; 
	        front = (front + 1) % capacity;
	        size--;
	        return data;
	    }

	    public T peek() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return buffer[front];
	    }

	   
	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public boolean isFull() {
	        return size == capacity;
	    }

	    public int size() {
	        return size;
	    }

	    public static void main(String[] args) {
	        CircularFIFOQueue<Integer> queue = new CircularFIFOQueue<>(3);
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);
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




