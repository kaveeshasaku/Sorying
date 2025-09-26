## Tower of Hanoi

### `HanoiTower.TowerOfHanoi`

- **Public class**: `TowerOfHanoi`
- **Public methods**:
  - `public static void solve(int n, char fromRod, char toRod, char auxRod)`

Description: Recursively prints the sequence of moves to transfer `n` disks from `fromRod` to `toRod` using `auxRod`.

Example:
```java
int n = 3;
HanoiTower.TowerOfHanoi.solve(n, 'A', 'C', 'B');
```

Output format:
```
Move disk X from rod A to rod C
```