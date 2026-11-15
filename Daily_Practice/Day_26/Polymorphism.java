// Write a C++ program using a class Student.

// Requirements:

// Data members:
// Name
// RollNo
// Marks
// Keep all data members private.
// Create public member functions:
// Accept() → accepts student information.
// Display() → displays student information.
// In main(), create an object and call both functions.

// Expected Output:

// Enter Name: Sanika
// Enter Roll Number: 10
// Enter Marks: 85

// Name: Sanika
// Roll Number: 10
// Marks: 85

import java.util.Scanner;

class Student
{
    private String Name;
    private int RollNo = 0;
    private float Marks = 0;

    Scanner obj = new Scanner(System.in);
    public void Accept()
    {

        System.out.println("Enter Name :");
        Name = obj.nextLine();

        System.out.println("Enter Roll No :");
        RollNo = obj.nextInt();

        System.out.println("Enter Marks :");
        Marks = obj.nextFloat();

    }

    public void Display()
    {
        System.out.println("Name :"+Name);
        System.out.println("Roll No :"+RollNo);
        System.out.println("Marks :"+Marks);
    }
}
class Polymorphism
{
    public static void main(String A[])
    {
        Student sobj = new Student();
        sobj.Accept();
        sobj.Display();

    }
}