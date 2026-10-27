import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   GreatestNumber
//  Input           :   Integer,Integer,Integer
//  Output          :   Integer
//  Description     :   Perform find the largest number among three given numbers
//  Date            :   27/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class Number
{
    public int GreatestNumber(int iNo1,     //First parameter
                              int iNo2,     //Second parameter
                              int iNo3      //Third parameter
                             )
    {
        if((iNo1 > iNo2) && (iNo1 > iNo3))
        {
            return iNo1;
        }
        else if((iNo2 > iNo1) && (iNo2 > iNo3))
        {
            return iNo2;
        }
        else
        {
            return iNo3;
        }
    }
}

class program14 
{
    public static void main(String A[]) 
    {
        int iValue1 = 0, iValue2 = 0, iValue3 = 0, iRet = 0;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter First Number:");
        iValue1 = scanner.nextInt();

        System.out.println("Enter Second Number:");
        iValue2 = scanner.nextInt();

        System.out.println("Enter Third Number:");
        iValue3 = scanner.nextInt();

        iRet = number.GreatestNumber(iValue1,iValue2,iValue3);

        System.out.println("Greatest Number is:"+iRet);
    }
    
}
