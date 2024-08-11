package BinaryTree;

public class BT {
	
	    static class Node {
	        int data;
	        Node left, right;

	        Node(int item) {
	            data = item;
	            left = right = null;
	        }
	    }

	    Node root;

	  
	    void insert(int data) {
	        root = insertRec(root, data);
	    }

	   
	    Node insertRec(Node root, int data) {
	       
	        if (root == null) {
	            root = new Node(data);
	            return root;
	        }

	      
	        if (data < root.data) {
	            root.left = insertRec(root.left, data);
	        } else if (data > root.data) {
	            root.right = insertRec(root.right, data);
	        }

	       
	        return root;
	    }

	
	    void delete(int data) {
	        root = deleteRec(root, data);
	    }

	    Node deleteRec(Node root, int data) {
	      
	        if (root == null) return root;

	       
	        if (data < root.data) {
	            root.left = deleteRec(root.left, data);
	        } else if (data > root.data) {
	            root.right = deleteRec(root.right, data);
	        } else {
	           

	          
	            if (root.left == null) return root.right;
	            if (root.right == null) return root.left;

	           
	            root.data = minValue(root.right);

	           
	            root.right = deleteRec(root.right, root.data);
	        }

	        return root;
	    }

	   
	    int minValue(Node root) {
	        int minValue = root.data;
	        while (root.left != null) {
	            minValue = root.left.data;
	            root = root.left;
	        }
	        return minValue;
	    }

	  
	    void preOrder() {
	        preOrderRec(root);
	    }

	   
	    void preOrderRec(Node root) {
	        if (root != null) {
	            System.out.print(root.data + " ");
	            preOrderRec(root.left);
	            preOrderRec(root.right);
	        }
	    }

	   
	    void inOrder() {
	        inOrderRec(root);
	    }

	   
	    void inOrderRec(Node root) {
	        if (root != null) {
	            inOrderRec(root.left);
	            System.out.print(root.data + " ");
	            inOrderRec(root.right);
	        }
	    }

	    
	    void postOrder() {
	        postOrderRec(root);
	    }

	 
	    void postOrderRec(Node root) {
	        if (root != null) {
	            postOrderRec(root.left);
	            postOrderRec(root.right);
	            System.out.print(root.data + " ");
	        }
	    }

	  
	    public static void main(String[] args) {
	        BT tree = new BT();

	        // Insert nodes
	        tree.insert(10);
	        tree.insert(67);
	        tree.insert(20);
	        tree.insert(35);
	        tree.insert(12);
	        tree.insert(5);
	        tree.insert(48);

	       
	        System.out.println("In-order traversal:");
	        tree.inOrder(); 
	        System.out.println();

	       
	        System.out.println("Pre-order traversal:");
	        tree.preOrder(); 
	        System.out.println();

	       
	        System.out.println("Post-order traversal:");
	        tree.postOrder(); 
	        System.out.println();

	       
	        tree.delete(70);
	        System.out.println("In-order traversal after deleting 70:");
	        tree.inOrder();
	        System.out.println();
	    }
	}

