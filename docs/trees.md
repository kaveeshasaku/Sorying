## Trees

### `BinaryTree.BT`

- **Public class**: `BT`
- **Fields**:
  - `Node root` (package-private)
- **Inner types**:
  - `static class Node { int data; Node left, right; }` (package-private)
- **Methods** (package-private):
  - `void insert(int data)` — inserts a value into the BST
  - `void delete(int data)` — deletes a value if present
  - `void preOrder()` — prints pre-order traversal
  - `void inOrder()` — prints in-order traversal
  - `void postOrder()` — prints post-order traversal

Notes:
- Methods are package-private; to call from other packages, change them to `public` or wrap in public methods.
- Deleting a non-existent value leaves the tree unchanged.

Example:
```java
BinaryTree.BT tree = new BinaryTree.BT();
tree.insert(10);
tree.insert(67);
tree.insert(20);
tree.inOrder(); // prints values in ascending order
```