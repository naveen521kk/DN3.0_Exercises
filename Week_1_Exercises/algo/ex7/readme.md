### Time Complexity

- The time complexity of the recursive algorithm is $O(n)$, where n is the number of periods. This is because each recursive call processes one period, leading to n recursive calls.

### Optimizing the Recursive Solution

**Avoiding Excessive Computation**

While the above recursive method is simple, it can be optimized to avoid the overhead of multiple function calls and to ensure better performance, especially for large values of `n`.

**Memoization**

One common optimization technique for recursive algorithms is memoization. Memoization involves storing the results of expensive function calls and returning the cached result when the same inputs occur again. This technique can significantly reduce the number of recursive calls and improve the overall performance of the algorithm.
