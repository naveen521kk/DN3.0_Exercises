### Time Complexity

- **Add Operation**:
  - Best Case: $O(1)$ (if adding at the head)
  - Average Case: $O(n)$ (if traversing to the end)
  - Worst Case: $O(n)$ (if traversing to the end)
  
- **Search Operation**:
  - Best Case: $O(1)$ (if the task is at the head)
  - Average Case: $O(n)$
  - Worst Case: $O(n)$
  
- **Traverse Operation**:
  - Best Case: $O(n)$
  - Average Case: $O(n)$
  - Worst Case: $O(n)$
  
- **Delete Operation**:
  - Best Case: $O(1)$ (if deleting at the head)
  - Average Case: $O(n)$ (if traversing to find the task)
  - Worst Case: $O(n)$ (if traversing to find the task)

### Advantages of Linked Lists Over Arrays for Dynamic Data

- **Dynamic Size**: Linked lists can grow and shrink in size dynamically, making them suitable for situations where the number of elements is not known in advance or can change frequently.
- **Efficient Insertions/Deletions**: Insertion and deletion operations are more efficient than in arrays, especially at the beginning or middle of the list, as there is no need to shift elements.
- **Memory Utilization**: Linked lists do not require contiguous memory allocation, which can be an advantage in memory-constrained environments.
