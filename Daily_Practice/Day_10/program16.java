import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   CheckPerfectNumber
//  Input           :   Integer 
//  Output          :   Boolean
//  Description     :   Perform perfect or not
//  Date            :   29/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class Number
{
    public boolean CheckPerfectNumber(int iNo)
    {
        int iCount = 0;
        int iSum = 0;

        for(iCount = 1; iCount <= iNo/2;iCount++)
        {
            if(iNo % iCount == 0)
            {
                iSum = iSum + iCount;
            }
        }

        if(iNo == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program16
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        
        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        bRet = number.CheckPerfectNumber(iValue);

        if(bRet == true)
        {
            System.out.println("Perfect Number.");
        }
        else
        {
            System.out.println("Not Perfect Number.");
        }
        
    }
}