# Sorting and Data Structures

This repository contains Java implementations of common data structures and algorithms, including:

- Sorting algorithms (Bubble, Insertion, Selection, Merge, Quick)
- Queue implementations (ArrayList-based, linked list, circular buffer) and a deque
- Linked lists (singly and doubly)
- Stack implementations and examples
- Binary search tree
- Tower of Hanoi solver

## Documentation

Comprehensive API documentation with usage examples is available under `docs/`:

- `docs/index.md` – documentation index
- `docs/algorithms.md` – sorting algorithms
- `docs/queues.md` – queues and deques
- `docs/lists.md` – singly/doubly linked lists
- `docs/stacks.md` – stacks and steque
- `docs/trees.md` – binary tree
- `docs/hanoi.md` – Tower of Hanoi

## Build and Run

These are simple Java classes with `main` methods for demonstration. You can compile and run with `javac` and `java`, for example:

```bash
javac -d out $(find . -name "*.java" -not -path "./Hanoi Tower/bin/*")
java -cp out Algorithem.BubbleSort
```

Adjust the main class as needed for the example you want to run.