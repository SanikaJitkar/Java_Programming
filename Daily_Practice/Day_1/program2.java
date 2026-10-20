import java.util.Scanner;
//---------------------------------------------------------------------------------------------------
//
//  Function name   :   Addition
//  Input           :   Integer ,Integer
//  Output          :   Integer
//  Description     :   Perform addition
//  Date            :   12/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//---------------------------------------------------------------------------------------------------
class Arithmetic
{
public int Addition(
                    int iNo1,       //first parameter
                    int iNo2        //second parameter
                   )
{
    int iAns = 0;
    iAns = iNo1 + iNo2;
    return iAns;
}
}
class program2
{
    public static void main(String A[])
    {
        int iValue1=0, iValue2=0, iResult=0;

        Scanner scanner = new Scanner(System.in);
        Arithmetic arithmetic = new Arithmetic();

        System.out.println("Enter first number:");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second number:");
        iValue2 = scanner.nextInt();

        iResult = arithmetic.Addition(iValue1,iValue2);

        System.out.println("Addition is ="+iResult);
    }
}