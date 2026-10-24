import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   CheckPositive
//  Input           :   Integer 
//  Output          :   Boolean
//  Description     :   Perform year is Leap or Not 
//  Date            :   23/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class Number
{
    public static void CheckPositive(int iNo)
    {
        if(iNo > 0)
        {
            System.out.println("Positive Number.");
        }
        else if(iNo == 0)
        {
            System.out.println("Zero.");
        }
        else
        {
           System.out.println("Negative Number."); 
        }
    }
}
class program10
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number:");
        iValue = scanner.nextInt();
        
        Number.CheckPositive(iValue);
    }

}