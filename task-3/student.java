class student
{
    int age;
    String name;
    int marks;
    student(String name)
    {
        this.name = name;
    }
    student(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    student(int age,String name,int marks)
    {
        this.age = age;
        this.name = name;
        this.marks = marks;
    }
   void display()
    {
        System.out.printf("Name : %s\n" ,name);
        System.out.printf("Age :%d\n" ,age);
        System.out.printf("Marks :%d\n" ,marks);
    }
}
