### Time Complexity

- **Add Operation**:
  - Best Case: $O(1)$ (adding at the end)
  - Average Case: $O(1)$
  - Worst Case: $O(1)$
  
- **Search Operation**:
  - Best Case: $O(1)$ (first element)
  - Average Case: $O(n)$
  - Worst Case: $O(n)$
  
- **Traverse Operation**:
  - Best Case: $O(n)$
  - Average Case: $O(n)$
  - Worst Case: $O(n)$
  
- **Delete Operation**:
  - Best Case: $O(1)$ (first element)
  - Average Case: $O(n)$
  - Worst Case: $O(n)$

### Limitations of Arrays

- **Fixed Size**: Arrays have a fixed size, which means that the maximum number of elements must be known beforehand. If more elements need to be stored than initially allocated, a new, larger array must be created, and elements must be copied over, which is time-consuming.
- **Inefficient Deletion**: Deleting an element from an array requires shifting subsequent elements, resulting in an $O(n)$ time complexity operation.
- **Inefficient Insertion**: Inserting an element at any position other than the end requires shifting elements, also resulting in $O(n)$ time complexity.

### When to Use Arrays

- **Fixed Size Collections**: Arrays are suitable when the number of elements is known and does not change, making memory allocation straightforward.
- **Fast Access**: Arrays provide $O(1)$ access time to elements via indexing, making them ideal for scenarios where quick access to elements by index is required.
- **Simple Structure**: Arrays have a simple structure with minimal overhead, making them efficient in terms of memory usage for small, fixed-size collections.
