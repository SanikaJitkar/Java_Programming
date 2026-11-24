import java.util.Scanner;

class Number
{
    public int SumFactors(int iNo)
    {
        int iCnt = 0, iSum = 0;

        for(iCnt = 1; iCnt <= iNo/2; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                iSum = iSum + iCnt;
            }
        }
        return iSum;
    }
}
class program23
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        iRet = number.SumFactors(iValue);

        System.out.println("Summation of factors:"+iRet);
    }
}
