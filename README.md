# Palindrome Checker App – UC12 (Strategy Pattern for Palindrome Algorithms)

## Objective
The objective of this application is to check whether a given string is a palindrome using the Strategy Design Pattern, allowing dynamic selection of different palindrome algorithms.

## Use Case
UC12: Strategy Pattern for Palindrome Algorithms (Advanced)

## Goal
Choose and apply a palindrome checking algorithm dynamically at runtime using different strategies.

## Algorithm / Flow
1. Define a PalindromeStrategy interface
2. Implement different strategies like StackStrategy and DequeStrategy
3. Normalize the input string by converting to lowercase and removing spaces
4. Allow the user to choose a strategy at runtime
5. Inject the selected strategy into the service class
6. Execute the palindrome check using the chosen strategy
7. Display whether the string is a palindrome or not

## Key Concepts Used
- Interface
- Polymorphism
- Strategy Design Pattern
- Dynamic Method Selection
- Encapsulation

## Data Structure Used
Varies based on strategy (Stack / Deque)

## How to Compile and Run
```bash
javac UseCase12PalindromeCheckerApp.java
java UseCase12PalindromeCheckerApp