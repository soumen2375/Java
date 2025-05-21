# Java Loops

Java provides several types of loops to execute a block of code repeatedly:

---

## For Loop

- Use when the number of iterations is known.
- Syntax:
    ```java
    for (initialization; condition; update) {
        // body
    }
    ```
- Example:
    ```java
    for (int i = 0; i < 5; i++) {
        System.out.println("Iteration: " + i);
    }
    // Output:
    // Iteration: 0
    // Iteration: 1
    // Iteration: 2
    // Iteration: 3
    // Iteration: 4
    ```

---

## While Loop

- Use when the number of iterations is not known in advance.
- Syntax:
    ```java
    while (condition) {
        // body
        // increment/decrement
    }
    ```
- Example:
    ```java
    int i = 0;
    while (i < 5) {
        System.out.println("Iteration: " + i);
        i++;
    }
    // Output:
    // Iteration: 0
    // Iteration: 1
    // Iteration: 2
    // Iteration: 3
    // Iteration: 4
    ```

---

## Do-While Loop

- Executes the loop body at least once, even if the condition is false.
- Syntax:
    ```java
    do {
        // body
        // increment/decrement
    } while (condition);
    ```
- Example:
    ```java
    int i = 0;
    do {
        System.out.println("Iteration: " + i);
        i++;
    } while (i < 5);
    // Output:
    // Iteration: 0
    // Iteration: 1
    // Iteration: 2
    // Iteration: 3
    // Iteration: 4
    ```

---

## Enhanced For Loop (For-Each Loop)

- Used to iterate over arrays or collections.
- Syntax:
    ```java
    for (dataType variable : arrayOrCollection) {
        // body
    }
    ```
- Example:
    ```java
    String[] names = {"Alice", "Bob", "Charlie"};
    for (String name : names) {
        System.out.println("Name: " + name);
    }
    // Output:
    // Name: Alice
    // Name: Bob
    // Name: Charlie
    ```

---

## Infinite Loops

- Occur when the loop condition never becomes false.
- Example:
    ```java
    // Infinite loop example (missing i++ will cause infinite loop)
    int i = 0;
    while (i < 5) {
        System.out.println("Iteration: " + i);
        // i++; // Uncommenting this will stop the infinite loop
    }
    ```