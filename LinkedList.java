package FIFOQueues;

	public class LinkedList<T> {

	    private Node<T> front;
	    private Node<T> rear;
	    private int size;

	    private static class Node<T> {
	        private T data;
	        private Node<T> next;

	        public Node(T data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    public LinkedList() {
	        this.front = null;
	        this.rear = null;
	        this.size = 0;
	    }

	    public void enqueue(T data) {
	        Node<T> newNode = new Node<>(data);
	        if (rear == null) {
	            front = rear = newNode;
	        } else {
	            rear.next = newNode;
	            rear = newNode;
	        }
	        size++;
	    }

	    public T dequeue() {
	        if (front == null) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        T data = front.data;
	        front = front.next;
	        if (front == null) {
	            rear = null;
	        }
	        size--;
	        return data;
	    }

	    public T peek() {
	        if (front == null) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return front.data;
	    }

	    public boolean isEmpty() {
	        return front == null;
	    }

	    public int size() {
	        return size;
	    }

	    public void display() {
	        if (front == null) {
	            System.out.println("Queue is empty");
	            return;
	        }
	        Node<T> current = front;
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {
	        LinkedList<Integer> queue = new LinkedList<>();
	        queue.enqueue(11);
	        queue.enqueue(20);
	        queue.enqueue(33);
	        System.out.println("Queue size: " + queue.size());
	        System.out.println("Current elements in the queue:");
	        queue.display();
	        System.out.println("Front element: " + queue.peek());
	        System.out.println("Removed element: " + queue.dequeue());
	        System.out.println("Queue size after removal: " + queue.size());
	        System.out.println("Current elements in the queue after removal:");
	        queue.display();
	        System.out.println("Front element after removal: " + queue.peek());
	    }
	}


