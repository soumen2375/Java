# Linear Search (Sequential Search)

Linear search (or sequential search) is a simple way to find an element in a list or array. It works by checking each element one by one from the beginning until the target is found or the end is reached.

## Steps

1. Start from the first element.
2. Compare each element with the target.
3. If a match is found, return its index.
4. If the target isn't found, return -1 to indicate it's not in the list.

## Example (Java)

```java
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index if the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }
}
```

## Time Complexity

- **O(n):** Checks each element; worst case is the last element or not found.

## Space Complexity

- **O(1):** Uses constant extra memory.

## Advantages

- Easy to implement.
- Works on sorted or unsorted lists.
- Good for small lists.

## Disadvantages

- Slow for large lists.
- Not ideal for frequent searches.

## Best Used When

- The list is small or unsorted.
- Simplicity is preferred over speed.