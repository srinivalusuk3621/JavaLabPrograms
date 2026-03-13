import java.util.Scanner;

class task6c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter an integer to divide 100: ");
            int n = sc.nextInt();
            int result = 100 / n;
            System.out.println("Result = " + result);
            int arr[] = new int[3];
            System.out.println("Accessing element at index 5: " + arr[5]);
            System.out.print("Enter a number as text: ");
            String s = sc.next();
            int num = Integer.parseInt(s);
            System.out.println("Converted number = " + num);
        }

        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException: division by zero.");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException: invalid index.");
        }

        catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException: invalid numeric format.");
        }

        catch(Exception e)
        {
            System.out.println("Some other exception occurred.");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}
