import java.util.Scanner;
//---------------------------------------------------------------------------------------------------
//
//  Function name   :   EvenOdd
//  Input           :   Integer 
//  Output          :   Boolean
//  Description     :   Perform even or odd number
//  Date            :   21/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//---------------------------------------------------------------------------------------------------
class Demo
{
    public boolean EvenOdd(
                            int iNo     //first parameter
                          )
{
    if(iNo % 2 == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
}
class program4
{
    public static void main(String A[])
    {
        int iValue =0;
        boolean iResult = false;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number :\n");
        iValue =scanner.nextInt();

        Demo demo = new Demo();
        iResult = demo.EvenOdd(iValue);

        if(iResult == true)
        {
            System.out.println("Even Number.");
        }
        else
        {
            System.out.println("Odd Number.");
        }
    }
}