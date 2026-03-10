 import java.util.Scanner;
class task1b {
public static void main (String[]args)
{
double a,b,c,d,root1,root2;
Scanner sc=new Scanner(System.in);
System.out.println("enter co-efficent of x^2  ");
a=sc.nextDouble();
System.out.println("enter co-efficent of x");
b=sc.nextDouble();
System.out.println("enter constant value");
c=sc.nextDouble();
d=(b*b)-(4*a*c);
System.out.printf("expression\n%.2fx^2 + %.2fx+%.2f\n",a,b,c);
if(d>0)
{
root1=(-b+Math.sqrt(d))/(2*a);
root2=(-b-Math.sqrt(d))/(2*a);
System.out.println("root are real and different");
System.out.println("root1="+root1);
System.out.println("root2="+root2);
}
else if(d==0)
{ 
root1=-b/(2*a);
System.out.println("roots are real and same");
System.out.println("roots are "+root1);
}
else
{
System.out.println("root are imaginarg");
double real =-b/(2*a);
double imag=Math.sqrt(-d)/(2*a);
System.out.println("root1="+real+"+"+imag);
System.out.println("root2="+real+"-"+imag);
}
}
}
