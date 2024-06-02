package Algorithem;

public class ModifiedBubbuleSort {
	
		 public static void MbubbleSort(int[] arr) {
		        int n = arr.length;
		        int Num;

		        while (n > 1) {
		            Num = 0;
		            for (int i = 1; i < n; i++) {
		                if (arr[i - 1] > arr[i]) {
		                    
		                    int temp = arr[i - 1];
		                    arr[i - 1] = arr[i];
		                    arr[i] = temp;
		                    Num = i;
		                }
		            }
		            n = Num;
		        }
		    }

		    public static void main(String[] args) {
		        int[] arr = {4, 44, 17, 72, 32, 25, 90};
		        System.out.println("Unsorted array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		        System.out.println();

		        MbubbleSort(arr);

		        System.out.println("Sorted array:");
		        for (int num : arr) {
		            System.out.print(num + " ");
		        }
		    }
		   
	}


