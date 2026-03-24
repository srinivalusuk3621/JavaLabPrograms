# Java Lab Programs

This repository contains **Java Lab Experiments** with **Aim, Code, and Output**.

---

# Experiment 1

## 1A – Default Values of Primitive Data Types

**Aim:**
Write a JAVA program to display default value of all primitive data types.

**Code:**

```java
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
```

**Output:**

![Output](task-1/output-task1a.png)

---

## 1B – Roots of Quadratic Equation

**Aim:**
Write a JAVA program that displays the roots of a quadratic equation ax²+bx+c=0.

**Code:**

```java
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
```

**Output:**

![Output](task-1/output-task1b.png)

---

# Experiment 2

## 2A – Class Mechanism

**Aim:**
Implement class mechanism in JAVA.

**Code:**

```java
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
```

**Output:**

![Output](task-2/output-task2a.png)

---

## 2B – Method Overloading

**Aim:**
Write a JAVA program to implement method overloading.

**Code:**

```java
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
```

**Output:**

![Output](task-2/output-task2b.png)

---

## 2C – Constructor Implementation

**Aim:**
Write a JAVA program to implement constructor.

**Code:**

```java
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
class task2c { public static void main(String [] args) {
             student obj=new student(18,"srinu",86.5);
              obj.display();
         }
}
```

**Output:**

![Output](task-2/output-task2c.png)

---

# Experiment 3

## 3A – Constructor Overloading

**Aim:**
Implement constructor overloading in JAVA.

**Code:**

```java
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
class task3a{
           public static void main(String[] args){
          student s1=new student("sreenu");
           student s2=new student(18,"sreenu");
             student s3=new student(18,"sreenu",90);
         s1.display();
         s2.display();
          s3.display();
}
}
```

**Output:**

![Output](task-3/output-task3a.png)

---

## 3B – Binary Search

**Aim:**
Write a JAVA program to search an element using binary search.

**Code:**

```java
import java.util.Scanner;
import java.util.Arrays;

public class  task3b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int low = 0;
        int high = n - 1;
        int mid;
        int pos = -1;

        while(low <= high)
        {
            mid = (low + high) / 2;

            if(arr[mid] == key)
            {
                pos = mid + 1;
                break;
            }
            else if(arr[mid] < key)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        if(pos != -1)
        {
            System.out.println("Element " + key + " found at position " + pos);
        }
        else
        {
            System.out.println("Element " + key + " not found in the list");
        }
    }
}
```

**Output:**

![Output](task-3/output-task3b.png)

---

## 3C – Bubble Sort

**Aim:**
Develop a JAVA program to sort elements using bubble sort.

**Code:**

```java
import java.util.Scanner;

public class  task3c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("Sorted Array in Ascending Order:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
```

**Output:**

![Output](task-3/output-task3c.png)

---

# Experiment 4

## 4A – Single Inheritance

**Aim:**
Write a JAVA program to implement single inheritance.

**Code:**

```java
public class Person
{
    String name;
    int age;

    Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    void displayPersonDetails()
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
public class Employee extends Person
{
    double annualSalary;
    int yearOfJoining;
    String nationalInsuranceNumber;

    Employee(String name, int age, double annualSalary, int yearOfJoining, String nationalInsuranceNumber)
    {
        super(name, age);
        this.annualSalary = annualSalary;
        this.yearOfJoining = yearOfJoining;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    void displayEmployeeDetails()
    {
        displayPersonDetails();
        System.out.println("Annual Salary: " + annualSalary);
        System.out.println("Year Of Joining: " + yearOfJoining);
        System.out.println("National Insurance Number: " + nationalInsuranceNumber);
    }
}
public class  task4a
{
    public static void main(String args[])
    {
        Employee emp1 = new Employee("srinu", 18, 25000.0, 2020, "NIT2463");
        emp1.displayEmployeeDetails();
    }
}

```

**Output:**

![Output](task-4/output-task4a.png)

---

## 4B – Multilevel Inheritance

**Aim:**
Write a JAVA program to implement multilevel inheritance.

**Code:**

```java
public class Bicycle
{
    String pedalType;

    void showBicycleInfo()
    {
        System.out.println("This is a bicycle with pedals.");
    }
}
public class Motorbike extends Bicycle
{
    int engineCapacity;

    void showMotorbikeInfo()
    {
        System.out.println("This motorbike has an engine.");
    }
}
public class ElectricBike extends Motorbike
{
    int batteryCapacity;

    void showElectricBikeInfo()
    {
        System.out.println("This electric bike has an electric motor and battery.");
    }
}
public class  task4b
{
    public static void main(String args[])
    {
        ElectricBike eBike = new ElectricBike();

        eBike.pedalType = "Standard";
        eBike.engineCapacity = 150;
        eBike.batteryCapacity = 500;

        eBike.showBicycleInfo();
        eBike.showMotorbikeInfo();
        eBike.showElectricBikeInfo();
    }
}
```

**Output:**

![Output](task-4/output-task4b.png)

---

## 4C – Abstract Class

**Aim:**
Construct an abstract class to find areas of different shapes.

**Code:**

```java
abstract class Figure
{
    double dim1;
    double dim2;

    Figure(double a, double b)
    {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
class Rectangle extends Figure
{
    Rectangle(double a, double b)
    {
        super(a,b);
    }

    double area()
    {
        return dim1 * dim2;
    }
}
class Triangle extends Figure
{
    Triangle(double a, double b)
    {
        super(a,b);
    }

    double area()
    {
        return 0.5 * dim1 * dim2;
    }
}
public class  task4c
{
    public static void main(String args[])
    {
        Figure f1 = new Rectangle(10,5);
        System.out.println("Area of Rectangle = " + f1.area());

        Figure f2 = new Triangle(10,5);
        System.out.println("Area of Triangle = " + f2.area());
    }
}

```

**Output:**

![Output](task-4/output-task4c.png)

---

# Experiment 5

## 5A – Interface Implementation

**Aim:**
Write a JAVA program to implement interface.

**Code:**

```java
interface Sortable
{
    void sort(int arr[]);
}
class BubbleSort implements Sortable
{
    public void sort(int arr[])
    {
        int n = arr.length;

        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
class SelectionSort implements Sortable
{
    public void sort(int arr[])
    {
        int n = arr.length;

        for(int i=0;i<n-1;i++)
        {
            int min = i;

            for(int j=i+1;j<n;j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
}
public class  task5a
{
    public static void main(String args[])
    {
        int arr1[] = {34,12,45,7,19};
        int arr2[] = {25,10,30,5,15};

        Sortable ref;

        ref = new BubbleSort();
        ref.sort(arr1);

        System.out.println("Array sorted using BubbleSort");
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        ref = new SelectionSort();
        ref.sort(arr2);

        System.out.println("Array sorted using SelectionSort");
        for(int i=0;i<arr2.length;i++)
        {
            System.out.print(arr2[i] + " ");
        }
    }
}
```

**Output:**

![Output](task-5/output-task5a.png)

---

## 5B – Runtime Polymorphism

**Aim:**
Write a JAVA program that implements runtime polymorphism.

**Code:**

```java
class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle
{
    void run()
    {
        System.out.println("Car is running on four wheels");
    }
}
class Bike extends Vehicle
{
    void run()
    {
        System.out.println("Bike is running on two wheels");
    }
}
public class  task5b
{
    public static void main(String args[])
    {
        Vehicle v;

        v = new Car();
        v.run();

        v = new Bike();
        v.run();

        v = new Vehicle();
        v.run();
    }
}

```

**Output:**

![Output](task-5/output-task5b.png)

---

## 5C – StringBuffer Operations

**Aim:**
Write a JAVA program using StringBuffer to delete and remove characters.

**Code:**

```java
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

**Output:**

![Output](task-5/output-task5c.png)

---

# Experiment 6

## 6A – Exception Handling

**Aim:**
Write a JAVA program that describes exception handling mechanism.

**Code:**

```java
import java.util.Scanner;

class  task6a
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter index to access element: ");
        int index = sc.nextInt();

        try
        {
            System.out.println("Element at index " + index + " is: " + arr[index]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index! Please enter index between 0 and " + (n-1));
        }

        sc.close();
    }
}
```

**Output:**

![Output](task-6/output-task6a.png)

---

## 6B – Multiple Catch Clauses

**Aim:**
Write a JAVA program illustrating multiple catch clauses.

**Code:**

```java
import java.util.Scanner;
import java.util.InputMismatchException;

class  task6b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = {10, 20, 30, 40, 50};

        try
        {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            int result = a / b;
            System.out.println("Result = " + result);

            System.out.print("Enter index to access array element: ");
            int index = sc.nextInt();

            System.out.println("Element at index = " + arr[index]);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Error: Division by zero is not allowed.");
        }

        catch(InputMismatchException e)
        {
            System.out.println("Error: Please enter numeric values only.");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Invalid array index.");
        }

        catch(Exception e)
        {
            System.out.println("Some other error occurred.");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}
```

**Output:**

![Output](task-6/output-task6b.png)

---

## 6C – Built-in Exceptions

**Aim:**
Write a JAVA program for built-in exceptions.

**Code:**

```java
import java.util.Scanner;

class task6c
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            System.out.print("Enter an integer to divide 100: ");
            int n = sc.nextInt();
            int result = 100 / n;
            System.out.println("Result = " + result);
            int arr[] = new int[3];
            System.out.println("Accessing element at index 5: " + arr[5]);
            System.out.print("Enter a number as text: ");
            String s = sc.next();
            int num = Integer.parseInt(s);
            System.out.println("Converted number = " + num);
        }

        catch(ArithmeticException e)
        {
            System.out.println("ArithmeticException: division by zero.");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("ArrayIndexOutOfBoundsException: invalid index.");
        }

        catch(NumberFormatException e)
        {
            System.out.println("NumberFormatException: invalid numeric format.");
        }

        catch(Exception e)
        {
            System.out.println("Some other exception occurred.");
        }

        System.out.println("Program continues...");
        sc.close();
    }
}
```

**Output:**

![Output](task-6/output-task6c.png)

---

# Experiment 7

## 7A – User Defined Exception

**Aim:**
Write a JAVA program for user defined exception.

**Code:**

```java
class InvalidCountryException extends Exception
{
    InvalidCountryException()
    {
        super();
    }

    InvalidCountryException(String msg)
    {
        super(msg);
    }
}
class  task7a
{
    void registerUser(String userName, String userCountry) throws InvalidCountryException
    {
        if(!userCountry.equals("India"))
        {
            throw new InvalidCountryException("User outside India cannot be registered");
        }
        else
        {
            System.out.println("User registration done successfully");
        }
    }

    public static void main(String args[])
    {
        task7a ur = new task7a();

        try
        {
            ur.registerUser("Ravi", "USA");
        }
        catch(InvalidCountryException e)
        {
            System.out.println(e.getMessage());
        }

        try
        {
            ur.registerUser("Anita", "India");
        }
        catch(InvalidCountryException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
```

**Output:**

![Output](task-7/output-task7a.png)

---

## 7B – Thread Creation using Thread Class

**Aim:**
Write a JAVA program that creates threads by extending Thread class.

**Code:**

```java
class GoodMorningThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class HelloThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("Hello");
                Thread.sleep(2000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class WelcomeThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("Welcome");
                Thread.sleep(3000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class  task7b
{
    public static void main(String args[])
    {
        GoodMorningThread t1 = new GoodMorningThread();
        HelloThread t2 = new HelloThread();
        WelcomeThread t3 = new WelcomeThread();

        t1.start();
        t2.start();
        t3.start();
    }
}
```

**Output:**

![Output](task-7/output-task7b.png)

---

## 7C – Runnable Interface Threads

**Aim:**
Repeat the thread program using Runnable interface.

**Code:**

```java
class LongRunningTask extends Thread
{
    public void run()
    {
        try
        {
            System.out.println("Long running task started...");

            for(int i = 1; i <= 5; i++)
            {
                System.out.println("Working... " + i);
                Thread.sleep(1000);
            }

            System.out.println("Long running task completed!");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class  task7c
{
    public static void main(String args[])
    {
        LongRunningTask task1 = new LongRunningTask();

        System.out.println("Before starting task1: " + task1.isAlive());

        task1.start();

        System.out.println("After starting task1: " + task1.isAlive());

        try
        {
            System.out.println("Main thread waiting for task1 to complete using join()...");
            task1.join();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        System.out.println("After join(): " + task1.isAlive());
        System.out.println("Main thread continues after task1 completed");
    }
}
```

**Output:**

![Output](task-7/output-task7c.png)

---

# Experiment 8

## 8A – Daemon Threads

**Aim:**
Write a JAVA program illustrating daemon threads.

**Code:**

```java
class DaemonThread extends Thread
{
    public void run()
    {
        try
        {
            while(true)
            {
                System.out.println("Daemon thread running");
                Thread.sleep(500);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class UserThread extends Thread
{
    public void run()
    {
        try
        {
            for(int i = 1; i <= 5; i++)
            {
                System.out.println("User thread iteration: " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}
class  task8a
{
    public static void main(String args[])
    {
        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
    }
}
```

**Output:**

![Output](task-8/output-task8a.png)

---

## 8B – Producer Consumer Problem

**Aim:**
Write a JAVA program implementing Producer Consumer problem using inter-thread communication.

**Code:**

```java
class Buffer
{
    int buffer[] = new int[5];
    int count = 0, in = 0, out = 0;

    synchronized void produce(int item) throws InterruptedException
    {
        while(count == buffer.length)
        {
            wait();
        }

        buffer[in] = item;
        in = (in + 1) % buffer.length;
        count++;

        notify();
    }

    synchronized int consume() throws InterruptedException
    {
        while(count == 0)
        {
            wait(); 
        }

        int item = buffer[out];
        out = (out + 1) % buffer.length;
        count--;

        notify(); 
        return item;
    }
}
class Producer extends Thread
{
    Buffer buffer;

    Producer(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public void run()
    {
        try
        {
            for(int i = 1; i <= 10; i++)
            {
                buffer.produce(i);
                System.out.println("Produced: " + i);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class Consumer extends Thread
{
    Buffer buffer;

    Consumer(Buffer buffer)
    {
        this.buffer = buffer;
    }

    public void run()
    {
        try
        {
            for(int i = 1; i <= 10; i++)
            {
                int item = buffer.consume();
                System.out.println("Consumed: " + item);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
class  task8b
{
    public static void main(String args[])
    {
        Buffer buffer = new Buffer();

        Producer p = new Producer(buffer);
        Consumer c = new Consumer(buffer);

        p.start();
        c.start();
    }
}
```

**Output:**

![Output](task-8/output-task8b.png)

---

## 8C – User Defined Packages

**Aim:**
Write a JAVA program that imports and uses user defined packages.

**Code:**

```java
package arithmetic;

public class ArithmeticOperations
{
    public int addition(int x, int y)
    {
        return x + y;
    }

    public int subtraction(int x, int y)
    {
        return x - y;
    }

    public int multiplication(int x, int y)
    {
        return x * y;
    }

    public int division(int x, int y)
    {
        return x / y;
    }
}
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

```

**Output:**

![Output](task-8/output-task8c.png)

---
