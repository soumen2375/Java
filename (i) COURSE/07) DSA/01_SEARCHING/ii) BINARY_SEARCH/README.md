# Binary Search Problems

This directory contains solutions to various problems that can be solved using the Binary Search algorithm. Binary Search is an efficient algorithm for finding an element in a sorted array by repeatedly dividing the search interval in half.

## Problems Solved

### 1. Find Index of a Given Number
- **File:** `Problem_01.java`
- **Description:** Find the index of a target number in a sorted array using Binary Search.
- **Input:** Target number.
- **Output:** Index of the target number or `-1` if not found.

### 2. Order-Agnostic Binary Search
- **File:** `Problem_02.java`
- **Description:** Perform Binary Search on arrays sorted in either ascending or descending order.
- **Input:** A sorted array (ascending or descending) and a target number.
- **Output:** Index of the target number or `-1` if not found.

### 3. Ceiling of a Number
- **File:** `Problem_03.java`
- **Description:** Find the smallest number in the array that is greater than or equal to the target number.
- **Input:** Target number.
- **Output:** Index of the ceiling number.

### 4. Floor of a Number
- **File:** `Problem_04.java`
- **Description:** Find the largest number in the array that is less than or equal to the target number.
- **Input:** Target number.
- **Output:** Value of the floor number.

### 5. Smallest Letter Greater Than Target
- **File:** `Problem_05.java`
- **Description:** Find the smallest letter in a sorted array that is greater than the target letter. The letters wrap around if no greater letter exists.
- **Input:** Target character.
- **Output:** The smallest letter greater than the target.


## Concepts Covered
- Binary Search basics.
- Order-agnostic Binary Search.
- Ceiling and floor of a number.
- Handling edge cases like wrapping around in character arrays.

## Time Complexity
- **Best Case:** O(1) (when the target is found at the middle).
- **Worst Case:** O(log n) (when the search space is reduced to one element).

## Space Complexity
- **O(1):** No additional space is used.

## Notes
- Ensure the input array is sorted before applying Binary Search.
- For character arrays, the wrapping behavior is implemented to handle edge cases.