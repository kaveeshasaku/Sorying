## Queues and Deques

This page documents queue implementations and related utilities.

### `CircularFIFOQueue.CircularFIFOQueue<T>`

- **Public class**: `CircularFIFOQueue<T>`
- **Constructor**: `public CircularFIFOQueue(int capacity)`
- **Public methods**:
  - `public void enqueue(T data)`
  - `public T dequeue()`
  - `public T peek()`
  - `public boolean isEmpty()`
  - `public boolean isFull()`
  - `public int size()`

Example:
```java
CircularFIFOQueue.CircularFIFOQueue<Integer> q = new CircularFIFOQueue.CircularFIFOQueue<>(3);
q.enqueue(1);
q.enqueue(2);
int front = q.peek();
int removed = q.dequeue();
```

### `LinkedList.FIFOLinkedList<T>`

- **Public class**: `FIFOLinkedList<T>`
- **Public methods**:
  - `public void enqueue(T data)`
  - `public T dequeue()`
  - `public T peek()`
  - `public boolean isEmpty()`
  - `public int size()`
  - `public void display()`

Example:
```java
LinkedList.FIFOLinkedList<Integer> q = new LinkedList.FIFOLinkedList<>();
q.enqueue(11);
q.enqueue(20);
int v = q.dequeue();
```

### `FIFOQueues.FIFOQueueArrayList<T>`

- **Public class**: `FIFOQueueArrayList<T>`
- **Public methods**:
  - `public void enqueue(T data)`
  - `public T dequeue()`
  - `public T peek()`
  - `public boolean isEmpty()`
  - `public int size()`

Example:
```java
FIFOQueues.FIFOQueueArrayList<String> q = new FIFOQueues.FIFOQueueArrayList<>();
q.enqueue("a");
String first = q.peek();
```

### `FIFOQueues.LinkedList<T>` (Queue implementation)

- **Public class**: `LinkedList<T>` in package `FIFOQueues`
- **Public methods**: same as `FIFOLinkedList<T>`

Example:
```java
FIFOQueues.LinkedList<Integer> q = new FIFOQueues.LinkedList<>();
q.enqueue(1);
```

### `Deque.FIFODeque<T>` (Deque via two queues)

- **Public class**: `FIFODeque<T>`
- **Public methods**:
  - `public void addFront(T item)`
  - `public void addBack(T item)`
  - `public T removeFront()`
  - `public T removeBack()`
  - `public boolean isEmpty()`
  - `public int size()`
  - `public void display()`

Example:
```java
Deque.FIFODeque<Integer> d = new Deque.FIFODeque<>();
d.addFront(1);
d.addBack(2);
int a = d.removeFront();
```

### Utilities

- `FIFOQueues.FIFOQueueWithArrayDeque`: Demonstrates `java.util.ArrayDeque` usage via `main`.