import java.util.Scanner;

public class add2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int a = 0, b = 1, sum = 0;

        if (n == 1) {
            sum = a;
        } 
        else if (n >= 2) {
            sum = a + b;

            for (int i = 3; i <= n; i++) {
                int c = a + b;
                sum = sum + c;
                a = b;
                b = c;
            }
        }

        System.out.println("Sum of first " + n + " Fibonacci numbers = " + sum);

        sc.close();
    }
}
