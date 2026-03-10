class overload
{
  int add(int a,int b) {
return a+b;
}
int add(int a,int b,int c)
{
return a+b+c;
}
double add(double a,double b) {
return a+b;
}
}
class task2b { public static void main(String[] args) {
overload obj=new overload();
System.out.printf("results of add of two integer:%d\n",obj.add(10,20));
System.out.printf("results of add of two double:%.2f\n",obj.add(10.0,20.0));
System.out.printf("results of add of three integer:%d\n",obj.add(10,20,30));
}
}
