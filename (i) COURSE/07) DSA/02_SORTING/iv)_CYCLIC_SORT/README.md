## Cyclic Sort

Cyclic Sort is an in-place sorting algorithm that is especially efficient for arrays containing distinct integers within a specific, known range (such as 1 to N).

### Algorithm Overview

1. **Iteration:**
   - The algorithm iterates through the array from the beginning.
2. **Correct Position Identification:**
   - For each element `nums[i]`, its correct sorted position (assuming 0-based indexing and values from 1 to N) is `nums[i] - 1`.
3. **Placement and Swapping:**
   - If `nums[i]` is already at its correct position (`nums[i] == nums[nums[i] - 1]`), move to the next element.
   - If not, swap `nums[i]` with the element at its correct position (`nums[nums[i] - 1]`).
   - Repeat this process until the current element is placed in its correct spot.
4. **Cycle Completion:**
   - Continue swapping until the element originally at `nums[i]` is correctly placed, completing a cycle. Then proceed to the next unsorted element.

### Key Characteristics

- **In-place:** Sorts the array without significant extra memory.
- **Unstable:** Does not guarantee the relative order of equal elements (though typically used with distinct elements).
- **Optimal in Writes:** Each element is written to its final position at most once, minimizing memory writes.

### Use Cases

Cyclic Sort is particularly useful when:
- The input array contains distinct integers within a specific range (e.g., 1 to N).
- Minimizing memory writes is important.
- Solving problems involving finding missing numbers, duplicates, or the smallest positive missing number in a given range.
