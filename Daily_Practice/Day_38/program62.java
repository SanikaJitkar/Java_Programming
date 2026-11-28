import java.util.Scanner;

class Number
{
    public boolean StrongNumber(int iNo)
    {
        int iDigit = 0, iFact = 1, iSum = 0, iCnt = 0;

        int iTemp = iNo;

        while (iNo != 0)
        {
            iDigit = iNo % 10;

            for(iCnt = iDigit, iFact = 1; iCnt >= 1; iCnt--)
            {
                iFact = iFact * iCnt;
            }
            iSum = iSum + iFact;
            iNo = iNo / 10;  
        }

        if(iTemp == iSum)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class program62
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter number:");
        iValue = scanner.nextInt();

        bRet = number.StrongNumber(iValue);

        if(bRet == true)
        {
            System.out.println("It is a strong number.");
        }
        else
        {
            System.out.println("It is not a strong number.");
        }

    }
}