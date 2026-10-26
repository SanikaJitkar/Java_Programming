import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   SumDigit
//  Input           :   Integer 
//  Output          :   Integer
//  Description     :   Perform Addition of first and last digit 
//  Date            :   26/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class Number
{
    public int SumDigit(int iNo)
    {
        int iDigit = 0;
        int iLastDigit = 0;
        iLastDigit = iNo % 10;
        while(iNo != 0)
        {
            iDigit = iNo % 10;
            
            iNo = iNo/10;
        }

        int iFirstDigit = iDigit;

        return (iLastDigit + iFirstDigit);
        
    }
}
class program12
{
    public static void main(String A[])
    {
        int iValue = 0;
        int iRet = 0;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        iRet = number.SumDigit(iValue);

        System.out.println("Addition of first and last digit:"+iRet);

    }
}