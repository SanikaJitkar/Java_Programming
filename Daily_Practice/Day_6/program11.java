import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   DisplayDigits
//  Input           :   Integer 
//  Output          :   None
//  Description     :   Perform display digit 
//  Date            :   25/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class Digit
{
public static void DisplayDigits(int iNo)
{
    int iDigit = 0;

    while(iNo != 0)
    {
        iDigit = iNo % 10;
        System.out.println(iDigit);
        iNo = iNo/10;
    }
}
}
class program11
{
    public static void main(String A[])
    {

        int iValue = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        Digit.DisplayDigits(iValue);
    }
}