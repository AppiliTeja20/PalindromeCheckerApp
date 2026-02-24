import java.util.*;

public class UseCase10PalindromeCheckerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String normalized = input.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = normalized.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        sc.close();
    }
}