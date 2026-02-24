# Palindrome Checker App – UC10 (Case-Insensitive & Space-Ignored Palindrome)

## Objective
The objective of this application is to check whether a given string is a palindrome by ignoring spaces and letter case, while strengthening string preprocessing and comparison concepts.

## Use Case
UC10: Case-Insensitive & Space-Ignored Palindrome

## Goal
Ignore spaces and case differences while validating whether a string is a palindrome.

## Algorithm / Flow
1. Read the input string from the user
2. Convert the string to lowercase
3. Remove all spaces using string preprocessing
4. Initialize two pointers (start and end)
5. Compare characters from both ends
6. Move pointers towards the center after each match
7. If all characters match, it is a palindrome
8. If any mismatch occurs, it is not a palindrome

## Key Concepts Used
- String Preprocessing
- Case Normalization
- Regular Expressions
- Two-Pointer Technique
- Efficient String Comparison

## Data Structure Used
String / Character Indexing

## How to Compile and Run
```bash
javac UseCase10PalindromeCheckerApp.java
java UseCase10PalindromeCheckerApp