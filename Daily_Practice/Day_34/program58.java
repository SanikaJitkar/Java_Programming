import java.util.Scanner;

class Number
{
    public void Pattern(int iNo1,int iNo2)
    {
        int i = 0, j = 0;

        for(i = 1; i<= iNo1; i++)
        {
            for(j = 1; j <= iNo2; j++)
            {
                if(i == j)
                {
                    System.out.print("$\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println("\n");
        }
    }
}
class program58
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter number of rows:");
        iValue1 = scanner.nextInt();

        System.out.println("Enter number of columns:");
        iValue2 = scanner.nextInt();

        number.Pattern(iValue1,iValue2);

    }
}