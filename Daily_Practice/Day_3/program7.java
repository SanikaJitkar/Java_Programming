import java.util.Scanner;
class Circle
{
    static float AreaofCircle(int iNo)
    {
        final float fpi = 3.14f;
        float fAns = 0.0f;
        fAns = fpi*((iNo)*(iNo));
        return fAns;

    }
}

class program7
{
    public static void main(String A[])
    {
        int iValue = 0;
        float fArea = 0.0f;
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Radius of circle:\n");
        iValue =scanner.nextInt();

        fArea = Circle.AreaofCircle(iValue);

        System.out.println("Area of circle :"+fArea);

    }
}