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
// Paste your code from task-3/task3a.java here
```

**Output:**

![Output](task-3/output-task3a.png)

---

## 3B – Binary Search

**Aim:**
Write a JAVA program to search an element using binary search.

**Code:**

```java
// Paste your code from task-3/task3b.java here
```

**Output:**

![Output](task-3/output-task3b.png)

---

## 3C – Bubble Sort

**Aim:**
Develop a JAVA program to sort elements using bubble sort.

**Code:**

```java
// Paste your code from task-3/task3c.java here
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
// Paste your code from task-4/task4a.java here
```

**Output:**

![Output](task-4/output-task4a.png)

---

## 4B – Multilevel Inheritance

**Aim:**
Write a JAVA program to implement multilevel inheritance.

**Code:**

```java
// Paste your code from task-4/task4b.java here
```

**Output:**

![Output](task-4/output-task4b.png)

---

## 4C – Abstract Class

**Aim:**
Construct an abstract class to find areas of different shapes.

**Code:**

```java
// Paste your code from task-4/task4c.java here
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
// Paste your code from task-5/task5a.java here
```

**Output:**

![Output](task-5/output-task5a.png)

---

## 5B – Runtime Polymorphism

**Aim:**
Write a JAVA program that implements runtime polymorphism.

**Code:**

```java
// Paste your code from task-5/task5b.java here
```

**Output:**

![Output](task-5/output-task5b.png)

---

## 5C – StringBuffer Operations

**Aim:**
Write a JAVA program using StringBuffer to delete and remove characters.

**Code:**

```java
// Paste your code from task-5/task5c.java here
```

**Output:**

![Output](task-5/output-task5c.png)

---

# Experiment 6

## 6A – Exception Handling

**Aim:**
Write a JAVA program that describes exception handling mechanism.

**Code:**

```java
// Paste your code from task-6/task6a.java here
```

**Output:**

![Output](task-6/output-task6a.png)

---

## 6B – Multiple Catch Clauses

**Aim:**
Write a JAVA program illustrating multiple catch clauses.

**Code:**

```java
// Paste your code from task-6/task6b.java here
```

**Output:**

![Output](task-6/output-task6b.png)

---

## 6C – Built-in Exceptions

**Aim:**
Write a JAVA program for built-in exceptions.

**Code:**

```java
// Paste your code from task-6/task6c.java here
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
// Paste your code from task-7/task7a.java here
```

**Output:**

![Output](task-7/output-task7a.png)

---

## 7B – Thread Creation using Thread Class

**Aim:**
Write a JAVA program that creates threads by extending Thread class.

**Code:**

```java
// Paste your code from task-7/task7b.java here
```

**Output:**

![Output](task-7/output-task7b.png)

---

## 7C – Runnable Interface Threads

**Aim:**
Repeat the thread program using Runnable interface.

**Code:**

```java
// Paste your code from task-7/task7c.java here
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
// Paste your code from task-8/task8a.java here
```

**Output:**

![Output](task-8/output-task8a.png)

---

## 8B – Producer Consumer Problem

**Aim:**
Write a JAVA program implementing Producer Consumer problem using inter-thread communication.

**Code:**

```java
// Paste your code from task-8/task8b.java here
```

**Output:**

![Output](task-8/output-task8b.png)

---

## 8C – User Defined Packages

**Aim:**
Write a JAVA program that imports and uses user defined packages.

**Code:**

```java
// Paste your code from task-8/task8c.java here
```

**Output:**

![Output](task-8/output-task8c.png)

---
