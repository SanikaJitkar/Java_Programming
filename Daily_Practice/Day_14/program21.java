import java.util.Scanner;

class Number
{
    public void Display(int iNo)
    {
        int iCnt = 0;
    
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println(iCnt);
        }

    }
}
class program21
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        number.Display(iValue);
        
    }
}
