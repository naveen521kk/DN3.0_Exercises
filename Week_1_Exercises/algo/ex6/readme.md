### Time Complexity

- **Linear Search**:
  - Best Case: $O(1)$ (first element)
  - Average Case: $O(n)$
  - Worst Case: $O(n)$ (last element or not found)
  
- **Binary Search**:
  - Best Case: $O(1)$ (middle element)
  - Average Case: $O(log n)$
  - Worst Case: $O(log n)$ (element not found)

### When to Use Each Algorithm

- **Linear Search**:
  - Suitable for small datasets where the overhead of sorting is not justified.
  - Useful when the list is unsorted or dynamically changing, making it impractical to maintain a sorted order.
  
- **Binary Search**:
  - Preferred for large datasets due to its logarithmic time complexity.
  - Requires the dataset to be sorted, so it incurs an additional cost for sorting if the list is not already sorted.
  - Efficient for scenarios where the list remains relatively static and search operations are frequent.
