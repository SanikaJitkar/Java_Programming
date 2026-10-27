import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   CheckNumber
//  Input           :   Integer 
//  Output          :   Boolean
//  Description     :   Perform Number divisible by 3 and 5 or not
//  Date            :   27/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class Number
{
    public boolean CheckNumber(int iNo)
    {
        if((iNo % 3 == 0) && (iNo % 5 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
class program13
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
            System.out.println("Number divisible by 3 and 5.");
        }
        else
        {
            System.out.println("Numberis not divisible by 3 and 5.");
        }


    }
}