import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   CheckNumber
//  Input           :   Integer 
//  Output          :   Boolean
//  Description     :   Perform Number multliply by 7
//  Date            :   28/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class Number
{
    public boolean CheckNumber(int iNo)
    {
        if(iNo % 7 == 0) 
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
class program15
{
    public static void main(String A[]) 
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter Number:");
        iValue =scanner.nextInt();

        bRet =number.CheckNumber(iValue);

        if(bRet == true)
        {
            System.out.println("Number is a multiple of 7.");
        }
        else
        {
            System.out.println("Number is not a multiple of 7.");
        }


    }
}
