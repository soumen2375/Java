# Bubble Sort

Bubble Sort is a simple comparison-based sorting algorithm that repeatedly steps through a list, compares adjacent elements, and swaps them if they are in the wrong order. The process continues until the list is sorted. It is named "Bubble Sort" because larger elements "bubble up" to their correct positions at the end of the list with each pass.

## How Bubble Sort Works

1. **Comparison and Swapping:**

   - The algorithm starts at the beginning of the list and compares the first two adjacent elements.
   - If they are in the wrong order (e.g., for ascending sort, the first element is greater than the second), they are swapped.

2. **Iteration:**

   - This comparison and swapping process continues for every pair of adjacent elements, moving from left to right, until the end of the list is reached.

3. **Largest Element Placement:**

   - After the first pass, the largest element in the unsorted portion of the list will have "bubbled up" to its correct sorted position at the end of the array.

4. **Reduced Scope:**

   - In subsequent passes, the algorithm iterates through a progressively smaller unsorted portion of the list, as the largest elements are already in their final positions.

5. **Termination:**
   - The process repeats for n-1 passes (where n is the number of elements), ensuring the entire array is sorted.
   - An optimization can be added to stop early if a pass completes without any swaps, indicating the list is already sorted.

## Characteristics

- **Time Complexity:**

  - Bubble Sort has a time complexity of O(N²) in the worst and average cases, making it inefficient for large datasets compared to more advanced sorting algorithms like Quick Sort or Merge Sort.

- **Space Complexity:**

  - It has a space complexity of O(1) as it only requires a small amount of extra space for temporary variables during swaps.

- **Simplicity:**
  - Its simplicity makes it a good algorithm for educational purposes to understand basic sorting concepts.

---

## Java Implementation

```java
// Basic Bubble Sorting Algorithm

import java.util.Arrays;

public class Problem_01 {
    public static void main(String[] args) {
        int[] num = { 5, 8, 9, 4, 7 };
        bubbleSort(num);
        System.out.println(Arrays.toString(num));
    }

    static void bubbleSort(int[] arr) {
        boolean swap;
        // every adjacent elements check
        for (int i = 0; i < arr.length - 1; i++) {
            swap = false;
            // for each step , max item will come at the last respective index
            for (int j = 0; j < arr.length - i - 1; j++) {
                // swap if the current element greater than the after element
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swap = true;
                }
            }
            // if didn't swap , it means the array is sorted
            if (swap == false) {
                break;
            }
        }
    }
}
```
--- 

### Explanation

#### `bubbleSort(int[] arr)` Method

- **arr**: The integer array to be sorted.
- **swap**: A boolean flag used for optimization. If no swaps occur during a complete pass, the array is already sorted and the algorithm stops early.
- **Outer loop**: Controls the number of passes. With each pass, the largest unsorted element "bubbles up" to its correct position at the end of the unsorted portion.
- **Inner loop**: Iterates through the unsorted part of the array, comparing adjacent elements. The condition `arr.length - i - 1` ensures only the unsorted portion is checked, as the last `i` elements are already sorted.
- **Swapping**: If `arr[j] > arr[j + 1]`, the elements are swapped to move the larger element to the right.
- **Early termination**: If no swaps occur in a pass (`swap` remains `false`), the array is already sorted and the loop breaks.

#### `main` Method

- Initializes an example integer array `num`.
- Prints the array before sorting.
- Calls the `bubbleSort` method to sort the array.
- Prints