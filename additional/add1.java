import java.util.Scanner;

public class add1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainString = sc.nextLine();

        System.out.print("Enter substring: ");
        String subString = sc.nextLine();

        System.out.print("Enter position: ");
        int position = sc.nextInt();

        if (position >= 0 && position <= mainString.length()) {

            String firstPart = mainString.substring(0, position);
            String secondPart = mainString.substring(position);

            String result = firstPart + subString + secondPart;

            System.out.println("Resulting string: " + result);
        } 
        else {
            System.out.println("Invalid position!");
        }

        sc.close();
    }
}
