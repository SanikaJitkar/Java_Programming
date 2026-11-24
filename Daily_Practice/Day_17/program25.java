import java.util.Scanner;

class PatternPrint
{
    public void Pattern(int iRow,int iCol)
    {
        int i = 0, j = 0;
        for(i = 1;i <= iRow;i++)
        {
            for(j = 1;j <= iCol;j++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }

}

class program25
{
    public static void main (String A[])
    {
        int iValue1 = 0,iValue2 = 0;
        Scanner scanner = new Scanner(System.in);
        PatternPrint patternPrint = new PatternPrint();

        System.out.println("Enter number of rows and coloum:");
        iValue1 = scanner.nextInt();
        iValue2 = scanner.nextInt();

        patternPrint.Pattern(iValue1,iValue2);


    }
}
