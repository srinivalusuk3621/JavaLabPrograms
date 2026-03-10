class student {
          String name;
         int age;
         double marks;
         student(int age,String  name,double marks)
            {
                 this.name=name;
                 this.age=age;
                this.marks=marks;

            }
    void display() {

        System.out.printf("name:%s\n",name);
        System.out.printf("age:%d\n",age);
        System.out.printf("marks:%.2f\n",marks);
     }
}
