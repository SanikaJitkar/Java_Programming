import java.util.Scanner;

class Number
{
    public int Factorial(int iNo)
    {
        int iCnt = 0;
        int iFact = 0;

        for(iCnt = 1,iFact = 1; iCnt <= iNo; iCnt++)
        {
            iFact = iFact * iCnt;
        }

        return iFact;
    }
}
class program22
{
    public static void main(String A[])
    {
        int iValue = 0 , iRet = 0;
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        iRet = number.Factorial(iValue);

        System.out.println("Factors of number:"+iRet);

    }
}
