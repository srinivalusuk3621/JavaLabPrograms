public class TestFigure
{
    public static void main(String args[])
    {
        Figure f1 = new Rectangle(10,5);
        System.out.println("Area of Rectangle = " + f1.area());

        Figure f2 = new Triangle(10,5);
        System.out.println("Area of Triangle = " + f2.area());
    }
}
