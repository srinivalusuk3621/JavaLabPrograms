import java.util.Scanner;

public class add3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int start = 0;
        int end = str.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome)
            System.out.println("String is a Palindrome");
        else
            System.out.println("String is NOT a Palindrome");

        sc.close();
    }
}
