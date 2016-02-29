import java.util.Scanner;
public class MyProg
{
    public static void main(String[] args)
    {
        String Name = "";
        String Exit;
        int sum;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first integer number");
        int Num1 = keyboard.nextInt();
        System.out.println("Enter second integer number");
        int Num2 = keyboard.nextInt();
        sum = Num1+ Num2;
        System.out.println("Summation of these two number is: "+sum);
        keyboard.nextLine(); //this is to get rid of \n
        System.out.println("Who is great?");
        Name = keyboard.nextLine();
        System.out.println(Name+" is great");
        System.out.println("Press Enter to exit");
        Exit = keyboard.nextLine();
        while(!Exit.equals(""));
    }
}
