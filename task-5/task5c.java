public class  task5c
{
    public static void main(String args[])
    {

        StringBuffer sb = new StringBuffer("Java Programming");

        System.out.println("Original StringBuffer: " + sb);

        sb.deleteCharAt(4);
        System.out.println("After deleting character at index 4: " + sb);

        sb.delete(0, 4);
        System.out.println("After deleting characters from index 0 to 4: " + sb);
    }
}
