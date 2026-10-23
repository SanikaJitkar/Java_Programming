import java.util.Scanner;
class program8
{
    public static void main(String A[])
    {
        int iHours = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Parking Hours:");
        iHours = scanner.nextInt();

        Charges.CalculateParkingCharge(iHours);

    }
}

class Charges
{
    public static void CalculateParkingCharge(int iHours)
    {
        int iCharges = 0;
        if(iHours > 0)
        {
        if(iHours <= 2)
        {
            iCharges = iHours * 20;
        }
        else if(iHours <= 5)
        {
            iCharges = (2 * 20) + ((iHours - 2) * 30);
        }
        else
        {
            iCharges = (2 * 20) + (3 * 30) + ((iHours - 5) * 50);
        }
        System.out.println("Parking Charges:"+iCharges);
        }
    }
}