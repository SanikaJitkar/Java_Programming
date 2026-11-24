import java.util.Scanner;

class Number
{
    public boolean ChkPrime(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;   
            }
        }

        if(iSum == 1)
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}
class program24
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        bRet = number.ChkPrime(iValue);

        if(bRet == true)
        {
            System.out.println("Prime Number.");
        }
        else
        {
            System.out.println("Not Prime Number.");
        }
    }
}
