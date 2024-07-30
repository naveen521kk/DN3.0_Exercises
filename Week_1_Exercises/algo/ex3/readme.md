### Time Complexity

- **Bubble Sort**:
  - Best Case: $O(n)$ (when the array is already sorted)
  - Average Case: $O(n^2)$
  - Worst Case: $O(n^2)$
- **Quick Sort**:
  - Best Case: $O(n log n)$
  - Average Case: $O(n log n)$
  - Worst Case: $O(n^2)$ (rare, can be mitigated with good pivot selection)

### Why Quick Sort is Preferred Over Bubble Sort

- Quick Sort is generally much faster than Bubble Sort for large datasets due to its average-case time complexity of $O(n log n)$.
- Quick Sort can handle large datasets more efficiently and scales better than Bubble Sort, which becomes impractically slow for large arrays.
- Although the worst-case complexity of Quick Sort is $O(n^2)$, this can be mitigated with good pivot selection strategies, making Quick Sort both fast and reliable in practice.
