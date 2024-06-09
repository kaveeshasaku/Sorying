package FIFOQueues;

	import java.util.ArrayDeque;
	import java.util.Queue;

	public class FIFOQueueWithArrayDeque { 
	    public static void main(String[] args) {
	        Queue<Integer> queue = new ArrayDeque<>();

	        queue.add(51);
	        queue.add(22);
	        queue.add(36);

	        System.out.println("Queue: " + queue);

	        int removedElement = queue.remove();
	        System.out.println("Removed Element: " + removedElement);

	        System.out.println("Queue after removal: " + queue);

	        int frontElement = queue.peek();
	        System.out.println("Front Element: " + frontElement);
	    }
	}



