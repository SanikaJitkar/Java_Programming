import java.util.Scanner;
//----------------------------------------------------------------------------------------------------
//
//  Function name   :   DisplayTable
//  Input           :   Integer 
//  Output          :   None
//  Description     :   Perform Table of N number
//  Date            :   30/10/2026
//  Author          :   Sanika Sunil Jitkar
//
//----------------------------------------------------------------------------------------------------
class Number
{
    public void DisplayTable(int iNo)
    {
        int iCnt = 0;
        int iTab = 0;

        for(iCnt = 1; iCnt <= 10; iCnt++)
        {
            iTab = iCnt * iNo;

            System.out.println(iTab+"\t");;
        }
    }    

    
}

class program18
{
    public static void main(String A[])
    {
        int iValue = 0;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();
        
        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        number.DisplayTable(iValue);
    
    }
}