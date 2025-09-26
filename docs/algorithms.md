## Algorithms

This page documents public classes and methods for the sorting algorithms and related utilities.

### `Algorithem.BubbleSort`

- **Public class**: `BubbleSort`
- **Public methods**:
  - `public static int[] BubbleSort(int[] arr)`

Description: In-place Bubble Sort implementation that returns the sorted array reference.

Example:
```java
int[] arr = {44, 84, 65, 22, 35, 15, 95, 9};
int[] sorted = Algorithem.BubbleSort.BubbleSort(arr);
System.out.println(java.util.Arrays.toString(sorted));
```

### `Algorithem.InsertionSort`

- **Public class**: `InsertionSort`
- **Public methods**:
  - `public static int[] insertionSort(int[] arr)`

Description: Standard insertion sort; sorts in place and returns the input reference.

Example:
```java
int[] arr = {5, 12, 28, 46, 67, 89};
int[] sorted = Algorithem.InsertionSort.insertionSort(arr);
```

### `Algorithem.ModifiedBubbuleSort`

- **Public class**: `ModifiedBubbuleSort`
- **Public methods**:
  - `public static void MbubbleSort(int[] arr)`

Description: Optimized Bubble Sort variant that reduces the inner loop range on each pass.

Example:
```java
int[] arr = {4, 44, 17, 72, 32, 25, 90};
Algorithem.ModifiedBubbuleSort.MbubbleSort(arr);
```

### `Algorithem.SelectionSort`

- **Public class**: `SelectionSort`
- **Public methods**:
  - `public static void selectionSort(int[] arr)`

Description: In-place selection sort.

Example:
```java
int[] arr = {20, 3, 12, 77, 64, 45, 81};
Algorithem.SelectionSort.selectionSort(arr);
```

### `MergeSort.MergeSorting`

- **Public class**: `MergeSorting`
- **Methods (package-private)**:
  - `void sort(int[] arr, int l, int r)`

Description: Top-down merge sort on the specified subarray range. Creates temporary arrays for merging. To call from other packages, make the method `public`.

Example (if made public or used within the same package):
```java
int[] arr = {22, 30, 15, 9, 2, 7};
MergeSort.MergeSorting ms = new MergeSort.MergeSorting();
ms.sort(arr, 0, arr.length - 1);
```

### `QuickSort.QuickSorting`

- **Public class**: `QuickSorting`
- **Methods (package-private)**: helper methods including `quickSort`

Usage: Either call within the `QuickSort` package or expose `quickSort` as `public` if you need to reuse externally. The class includes a `public static void main` demonstrating usage.

Example (if `quickSort` is made public):
```java
int[] arr = {25, 17, 38, 19, 1, 6};
QuickSort.QuickSorting.quickSort(arr, 0, arr.length - 1);
```