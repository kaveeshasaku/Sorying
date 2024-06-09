package StequeImplementation;


	class Node<T> {
	    T data;
	    Node<T> next;

	    Node(T data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	public class Steque<T> {
	    private Node<T> top;
	    private Node<T> bottom;
	    private int size;

	    public Steque() {
	        this.top = null;
	        this.bottom = null;
	        this.size = 0;
	    }

	    public void push(T data) {
	        Node<T> newNode = new Node<>(data);
	        if (isEmpty()) {
	            top = bottom = newNode;
	        } else {
	            newNode.next = top;
	            top = newNode;
	        }
	        size++;
	    }

	    public void enqueue(T data) {
	        Node<T> newNode = new Node<>(data);
	        if (isEmpty()) {
	            top = bottom = newNode;
	        } else {
	            bottom.next = newNode;
	            bottom = newNode;
	        }
	        size++;
	    }

	    public T pop() {
	        if (isEmpty()) {
	            throw new IllegalStateException("Steque is empty");
	        }
	        T data = top.data;
	        top = top.next;
	        if (top == null) {
	            bottom = null;
	        }
	        size--;
	        return data;
	    }

	    public boolean isEmpty() {
	        return size == 0;
	    }

	    public int size() {
	        return size;
	    }

	    public static void main(String[] args) {
	        Steque<Integer> steque = new Steque<>();
	        steque.push(1);
	        steque.push(2);
	        steque.enqueue(3);
	        System.out.println("Steque size: " + steque.size());
	        System.out.println("Pop element: " + steque.pop());
	        System.out.println("Steque size after pop: " + steque.size());
	        steque.enqueue(4);
	        System.out.println("Steque size after enqueue: " + steque.size());
	        System.out.println("Pop element: " + steque.pop());
	        System.out.println("Pop element: " + steque.pop());
	        System.out.println("Pop element: " + steque.pop());
	        System.out.println("Steque size after multiple pops: " + steque.size());
	    }
	}


