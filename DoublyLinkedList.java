package LinkedList;

public class DoublyLinkedList {

		  
	  
	    class Node{  
	        int data;  
	        Node previous;  
	        Node next;  
	  
	        public Node(int data) {  
	            this.data = data;  
	        }  
	    }  
	  
	    Node head, tail = null;  
	  
	    public void addNode(int data) {  
	        Node newNode = new Node(data);  
	  
	        if(head == null) {  
	            head = tail = newNode;  
	            head.previous = null;  
	            tail.next = null;  
	        }  
	        else {  
	            tail.next = newNode;  
	            newNode.previous = tail;  
	            tail = newNode;  
	            tail.next = null;  
	        }  
	    }  
	  
	    public void display() {  
	        Node current = head;  
	        if(head == null) {  
	            System.out.println("List is empty");  
	            return;  
	        }  
	        System.out.println("Nodes of doubly linked list: ");  
	        while(current != null) {  
	  
	            System.out.print(current.data + " ");  
	            current = current.next;  
	        }  
	    }  
	  
	    public static void main(String[] args) {  
	  
	        DoublyLinkedList dList = new DoublyLinkedList();  
	        dList.addNode(15);  
	        dList.addNode(24);  
	        dList.addNode(36);  
	        dList.addNode(41);  
	        dList.addNode(53);  
	  
	        dList.display();  
	    }  
	}  




