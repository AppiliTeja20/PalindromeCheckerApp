# Palindrome Checker App – UC8 (Linked List Based Palindrome Checker)

## Objective
The objective of this application is to check whether a given string is a palindrome using a singly linked list while improving understanding of data structures and algorithms.

## Use Case
UC8: Linked List Based Palindrome Checker

## Goal
Check palindrome using a singly linked list by reversing the second half and comparing both halves.

## Algorithm / Flow
1. Read the input string from the user
2. Convert the string to lowercase and remove spaces
3. Create a singly linked list from the characters
4. Use fast and slow pointers to find the middle of the list
5. Reverse the second half of the linked list
6. Compare the first half and the reversed second half
7. If all characters match, it is a palindrome
8. If any mismatch occurs, it is not a palindrome

## Key Concepts Used
- Singly Linked List
- Node Traversal
- Fast and Slow Pointer Technique
- In-Place Reversal
- Efficient Palindrome Checking

## Data Structure Used
Singly Linked List

## How to Compile and Run
```bash
javac UseCase8PalindromeCheckerApp.java
java UseCase8PalindromeCheckerApp