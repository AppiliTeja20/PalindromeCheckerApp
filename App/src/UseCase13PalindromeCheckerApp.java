import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static boolean arrayMethod(String input) {
        String str = input.toLowerCase().replaceAll("\\s+", "");
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean stackMethod(String input) {
        String str = input.toLowerCase().replaceAll("\\s+", "");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static boolean dequeMethod(String input) {
        String str = input.toLowerCase().replaceAll("\\s+", "");
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++) {
            deque.addLast(str.charAt(i));
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        long start1 = System.nanoTime();
        boolean result1 = arrayMethod(input);
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        boolean result2 = stackMethod(input);
        long end2 = System.nanoTime();

        long start3 = System.nanoTime();
        boolean result3 = dequeMethod(input);
        long end3 = System.nanoTime();

        System.out.println("\nArray Method: " + (result1 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Time Taken (Array): " + (end1 - start1) + " ns");

        System.out.println("\nStack Method: " + (result2 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Time Taken (Stack): " + (end2 - start2) + " ns");

        System.out.println("\nDeque Method: " + (result3 ? "Palindrome" : "Not Palindrome"));
        System.out.println("Time Taken (Deque): " + (end3 - start3) + " ns");

        sc.close();
    }
}