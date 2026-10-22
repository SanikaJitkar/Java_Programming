import java.util.Scanner;
class program5
{

    public static void main(String A[])
    {
        String sName = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your Name:");
        sName = scanner.nextLine();

        System.out.println("Welcome..."+sName);

    }
}