import java.util.*;

interface PalindromeStrategy {
    boolean isPalindrome(String input);
}

class StackStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < normalized.length(); i++) {
            stack.push(normalized.charAt(i));
        }

        for (int i = 0; i < normalized.length(); i++) {
            if (normalized.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

class DequeStrategy implements PalindromeStrategy {
    public boolean isPalindrome(String input) {
        String normalized = input.toLowerCase().replaceAll("\\s+", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < normalized.length(); i++) {
            deque.addLast(normalized.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}

class PalindromeService {
    private PalindromeStrategy strategy;

    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String input) {
        return strategy.isPalindrome(input);
    }
}

public class UseCase12PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Strategy:");
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeService service = new PalindromeService();

        if (choice == 1) {
            service.setStrategy(new StackStrategy());
        } else {
            service.setStrategy(new DequeStrategy());
        }

        if (service.checkPalindrome(input)) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}