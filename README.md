# Palindrome Checker App – UC13 (Performance Comparison)

## Objective
The objective of this application is to compare the performance of different palindrome checking approaches by measuring their execution time.

## Use Case
UC13: Performance Comparison

## Goal
Run multiple palindrome algorithms and compare their execution time to analyze efficiency.

## Algorithm / Flow
1. Read the input string from the user
2. Normalize the string by converting to lowercase and removing spaces
3. Execute Array (Two-Pointer) palindrome method
4. Record execution time using System.nanoTime()
5. Execute Stack-based palindrome method
6. Record execution time
7. Execute Deque-based palindrome method
8. Record execution time
9. Display palindrome result and time taken for each method

## Key Concepts Used
- System.nanoTime()
- Algorithm Performance Comparison
- Time Complexity Awareness
- Multiple Method Execution
- Efficient String Processing

## Data Structures Used
- String / Array (Two-Pointer)
- Stack
- Deque (ArrayDeque)

## How to Compile and Run
```bash
javac UseCase13PalindromeCheckerApp.java
java UseCase13PalindromeCheckerApp