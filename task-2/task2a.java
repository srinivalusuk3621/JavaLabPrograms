class cseg { 
void print_msg() {
System.out.printf("this is cse-g section\n");
}
int add(int a,int b)
{
  return a+b;
}
}
class task2a 
{
public static void main(String[] args)
{
   cseg obj=new cseg();
   obj.print_msg();
   System.out.printf("sum:%d\n",obj.add(10,20));
}
}
