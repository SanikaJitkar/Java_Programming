import java.util.Scanner;
class Number
{
    public int Frequency(int Arr[],int iLength,int iNo)
    {
        int iCnt = 0, iCount = 0;
        for(iCnt = 0; iCnt <= iLength - 1; iCnt++)
        {
            if(Arr[iCnt] == iNo)
            {
                iCount++;
            }

        }
        return iCount;
    }

}

class program63
{
    public static void main(String A[])
    {
        int ptr[] = null;
        int iCnt = 0, iSize = 0,iValue = 0,iRet = 0;

        Scanner scanner = new Scanner(System.in);
        Number number = new Number();

        System.out.println("Enter number of elements:");
        iSize = scanner.nextInt();

       ptr = new int[iSize];

       System.out.println("Enter element:");
       for(iCnt = 0; iCnt <= iSize - 1; iCnt++)
       {
            ptr[iCnt] =scanner.nextInt();
       }

       System.out.println("Enter frequent number:");
       iValue = scanner.nextInt();

       iRet = number.Frequency(ptr,iSize,iValue);

       System.out.println(iRet);


    }
}