import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   CheckYear
//  Input           :   Integer 
//  Output          :   Boolean
//  Description     :   Perform year is Leap or Not 
//  Date            :   23/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class program9
{
    public static void main(String A[])
    {
        int iYear = 0;
        Boolean bRet = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year:");
        iYear = scanner.nextInt();

        bRet = Year.CheckYear(iYear);
        if(bRet == true)
        {
            System.out.println(iYear+" is Leap Year.");
        }
        else
        {
          System.out.println(iYear+" is Not Leap Year.");  
        }
    }
}

class Year
{
    public static Boolean CheckYear(int iYear)
    {
        if(iYear > 0)
        {
            if((iYear % 400 == 0) || (iYear % 4 == 0) && (iYear % 100 != 0))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        return false;
    }
}