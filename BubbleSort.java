package Algorithem;

public class BubbleSort {
	public static int[] BubbleSort(int arr[]) 
	    { 
	        int n = arr.length;
	        
	        for (int i = 0; i < n - 1; i++) 
	            for (int j = 0; j < n - i - 1; j++) 
	                if (arr[j] > arr[j + 1]) { 
	                   
	                    int temp = arr[j]; 
	                    arr[j] = arr[j + 1]; 
	                    arr[j + 1] = temp; 
	                }
			return arr; 
	    } 
	  
	
	    void printArray(int arr[]) 
	    { 
	        int n = arr.length; 
	        for (int i = 0; i < n; ++i) 
	            System.out.print(arr[i] + " "); 
	        System.out.println(); 
	    } 
	  
	     
	    public static void main(String args[]) 
	    { 
	        BubbleSort ob = new BubbleSort();
	        
	        int arr[] = { 44, 84, 65, 22, 35, 15, 95, 9 }; 
	       ob.BubbleSort(arr); 
	       
	        System.out.println("Sorted array"); 
	        ob.printArray(arr);
	        
	        arr = BubbleSort(arr);
	        

}


}
