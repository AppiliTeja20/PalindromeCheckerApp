# Palindrome Checker App – UC9 (Recursive Palindrome Checker)

## Objective
The objective of this application is to check whether a given string is a palindrome using recursion while strengthening core programming fundamentals and understanding of recursive logic.

## Use Case
UC9: Recursive Palindrome Checker

## Goal
Check palindrome using recursion by comparing start and end characters.

## Algorithm / Flow
1. Read the input string from the user
2. Convert the string to lowercase and remove spaces
3. Call a recursive function with start and end indexes
4. Compare the first and last characters
5. If they match, recursively check the remaining substring
6. Stop when the start index becomes greater than or equal to the end index
7. If all characters match, it is a palindrome
8. If any mismatch occurs, it is not a palindrome

## Key Concepts Used
- Recursion
- Base Condition
- Call Stack
- String Indexing
- Efficient Palindrome Validation

## Data Structure Used
Call Stack (Recursion)

## How to Compile and Run
```bash
javac UseCase9PalindromeCheckerApp.java
java UseCase9PalindromeCheckerApp