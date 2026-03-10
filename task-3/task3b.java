import java.util.Scanner;
import java.util.Arrays;

public class  task3b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int mid;
        int pos = -1;

        while(low <= high)
        {
            mid = (low + high) / 2;

            if(arr[mid] == key)
            {
                pos = mid + 1;
                break;
            }
            else if(arr[mid] < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        if(pos != -1)
        {
            System.out.println("Element " + key + " found at position " + pos);
        }
        else
        {
            System.out.println("Element " + key + " not found in the list");
        }
    }
}
