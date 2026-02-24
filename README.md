# Palindrome Checker App – UC11 (Object-Oriented Palindrome Service)

## Objective
The objective of this application is to check whether a given string is a palindrome using an object-oriented approach by encapsulating the palindrome logic inside a separate class.

## Use Case
UC11: Object-Oriented Palindrome Service

## Goal
Encapsulate palindrome checking logic in a dedicated class and expose a method to validate palindromes.

## Algorithm / Flow
1. Read the input string from the user
2. Create a PalindromeChecker class
3. Normalize the string by converting to lowercase and removing spaces
4. Use two-pointer technique to compare characters from start and end
5. Return true if all characters match
6. Return false if any mismatch occurs
7. Display the result in the main application class

## Key Concepts Used (OOPS)
- Encapsulation
- Single Responsibility Principle
- Class and Object
- Method Abstraction
- String Preprocessing

## Data Structure Used
Internal String / Character Indexing

## How to Compile and Run
```bash
javac UseCase11PalindromeCheckerApp.java
java UseCase11PalindromeCheckerApp