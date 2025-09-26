## Stacks

### `LinkedList.StackLinkedList`

- **Public class**: `StackLinkedList`
- **Public methods**:
  - `public void stackPush(int x)`
  - `public int stackPop()`
  - `public int stackSize()`
  - `public boolean stackIsEmpty()`
  - `public void printStack()`

Example:
```java
LinkedList.StackLinkedList s = new LinkedList.StackLinkedList();
s.stackPush(10);
s.stackPush(20);
int v = s.stackPop();
int n = s.stackSize();
```

### `StequeImplementation.Steque<T>` (Stack-Queue hybrid)

- **Public class**: `Steque<T>`
- **Public methods**:
  - `public void push(T data)`
  - `public void enqueue(T data)`
  - `public T pop()`
  - `public boolean isEmpty()`
  - `public int size()`

Notes: A steque supports stack operations (`push`, `pop`) and queue operation (`enqueue`) efficiently.

Example:
```java
StequeImplementation.Steque<Integer> stq = new StequeImplementation.Steque<>();
stq.push(1);
stq.push(2);
stq.enqueue(3);
int top = stq.pop();
```

### Java `Stack` examples

These classes demonstrate `java.util.Stack` operations via `main`:

- `DataStructures.StackPush`
- `DataStructures.StackPop`
- `DataStructures.StackPeek`

Use `java.util.Stack` directly in your code:
```java
java.util.Stack<Integer> st = new java.util.Stack<>();
st.push(1);
int top = st.peek();
int popped = st.pop();
```