class primitive
{
  byte byte_datatype;
   short short_datatype;
  int integer;
 long long_datatype;
 float floating;
  double double_datatype;
  char character;
  boolean boolean_datatype;
}
class task1a {
  public static void main(String[] args)
{
   primitive obj=new primitive();
  
        System.out.println("defalut byte value : " + obj.byte_datatype);
        System.out.println("default short value: " + obj.short_datatype);
        System.out.println("defalut int value  : " + obj.integer);
        System.out.println("defalut long value : " + obj.long_datatype);
        System.out.println("defalut float value: " + obj.floating);
        System.out.println("defalut double value: " + obj.double_datatype);
        System.out.println("defalut char value : " + obj.character);
        System.out.println("defalut boolean valuue: " + obj.boolean_datatype);
    }
}

