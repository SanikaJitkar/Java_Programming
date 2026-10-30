import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   Factorial
//  Input           :   Integer 
//  Output          :   Integer
//  Description     :   Perform factorial of number
//  Date            :   30/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class Number
{
    public int Factorial(int iNo)
    {
        int iCnt = 0;
        int iFact = 1;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            iFact =  iFact * iCnt;

        }
        return iFact;
    }
    
}

class program17
{
    public static void main(String A[])
    {
        int iValue = 0,iRet =0;
        

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        
        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        iRet = number.Factorial(iValue);

        System.out.println("Factor of Number: "+iRet);
        
    }
}