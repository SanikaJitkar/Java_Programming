import java.util.Scanner;

class Number
{
    public boolean Palindrome(int iNo)
    {

        int iDigit = 0;
        int iRev = 0;
        int iTemp = 0;

        iTemp = iNo;

        while(iNo != 0 )
        {
            iDigit = iNo % 10;
            iRev = (iRev * 10) + iDigit;
            iNo = iNo / 10;
        }
        if(iRev == iTemp)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
public class program60 
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter Number:");
        iValue = scanner.nextInt();

        bRet = number.Palindrome(iValue);

        if(bRet == true)
        {
            System.out.println("It is a palindrome number.");
        }
        else
        {
            System.out.println("It is not a palindrome number.");
        }

    }    

}
