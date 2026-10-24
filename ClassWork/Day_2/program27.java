import java.util.Scanner;

class program27
{
    public static void main(String A[])
    {
        Scanner scanner =null;
        String sName =null;
        int iAge = 0;
        float fMarks = 0.0;     //Error due to lossy conversion

        
        scanner = new Scanner(System.in);

        System.out.println("Enter Your Name ");
        sName = scanner.next();

        System.out.println("Enter your Age :");
        iAge = scanner.nextInt();

        System.out.println("Enter your Marks :");
        fMarks = scanner.nextFloat();        
        
        System.out.println("Welcome "+sName);
        System.out.println("Your Age is : "+iAge);
        System.out.println("Your Marks : "+fMarks);


    }
}