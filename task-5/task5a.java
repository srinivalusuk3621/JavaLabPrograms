public class  task5a
{
    public static void main(String args[])
    {
        int arr1[] = {34,12,45,7,19};
        int arr2[] = {25,10,30,5,15};

        Sortable ref;

        ref = new BubbleSort();
        ref.sort(arr1);

        System.out.println("Array sorted using BubbleSort");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        ref = new SelectionSort();
        ref.sort(arr2);

        System.out.println("Array sorted using SelectionSort");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
