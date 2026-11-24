import java.util.Scanner;

class Number
{
    public void Pattern(int iNo1, int iNo2)
    {
        int i = 0, j = 0;
        
        for(i = 0; i <= iNo1; i++)
        {
            for(j = 0; j <= iNo2; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("\n");
        }
       
    }
}
class program57
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter Number of Rows:");
        iValue1 = scanner.nextInt();

        System.out.println("Enter Number of Columns:");
        iValue2 = scanner.nextInt();

        number.Pattern(iValue1,iValue2);
    }
}