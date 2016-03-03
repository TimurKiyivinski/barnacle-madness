import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter a line of text.");
        String userInput = "";
        Scanner keyBoard = new Scanner(System.in);
        userInput = keyBoard.nextLine();
        System.out.println("I have rephrased that line to read:");
        System.out.println(userInput.replaceFirst("hate", "love"));
    }
}
