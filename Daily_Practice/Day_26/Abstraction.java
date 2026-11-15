// Abstraction 🟡

// Now write a Java and C++ program for a BankAccount.

// Requirements:

// Data members:
// AccountNo
// Balance
// Keep them private.
// Create public methods:
// Accept() → accept account details
// Deposit() → add money to balance
// Display() → display account number and final balance

import java.util.Scanner;

class BankAccount
{
    private int AccountNo = 0;
    private float Balance = 0;
    public float FinalBalance = 0;

    Scanner sobj = new Scanner(System.in);

    public void Accept()
    {
        System.out.println("Enter Account No :");
        AccountNo = sobj.nextInt();

        System.out.println("Enter Balance :");
        Balance = sobj.nextFloat();

    }

    public void Deposit()
    {
        Balance = Balance + 500;
        
    }

    public void Display()
    {
        System.out.println("Account No :"+AccountNo);
        System.out.println("Final Balance :"+Balance);
    }
}
class Abstraction
{
    public static void main(String A[])
    {
        BankAccount bobj = new BankAccount();
        bobj.Accept();
        bobj.Deposit();
        bobj.Display();
    }
}