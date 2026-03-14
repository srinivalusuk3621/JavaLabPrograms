import arithmetic.*;

class task8c
{
    public static void main(String args[])
    {
        ArithmeticOperations ao = new ArithmeticOperations();

        int sum = ao.addition(10,5);
        System.out.println("Addition: " + sum);

        int diff = ao.subtraction(10,5);
        System.out.println("Subtraction: " + diff);

        int prod = ao.multiplication(10,5);
        System.out.println("Multiplication: " + prod);

        int quot = ao.division(10,5);
        System.out.println("Division: " + quot);
    }
}
