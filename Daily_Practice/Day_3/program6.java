import java.util.Scanner;

class program6
{
    public static void main(String A[])
    {
        String sName =null;
        int iAge = 0;
        float fMarks =0.0f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name:");
        sName = scanner.nextLine();

        System.out.println("Enter your Age:");
        iAge = scanner.nextInt();

        System.out.println("Enter your Marks:");
        fMarks = scanner.nextFloat();

        System.out.println("Name:"+sName);
        System.out.println("Age:"+iAge);
        System.out.println("Marks:"+fMarks);


    }
}