import java.util.Scanner;
import java.util.InputMismatchException;

class  task6b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        try
        {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);

            System.out.print("Enter index to access array element: ");
            int index = sc.nextInt();

            System.out.println("Element at index = " + arr[index]);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }

        catch(InputMismatchException e)
        {
            System.out.println("Error: Please enter numeric values only.");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Invalid array index.");
        }

        catch(Exception e)
        {
            System.out.println("Some other error occurred.");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}
