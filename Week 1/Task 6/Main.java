import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String userInput = "";
        Scanner keyBoard = new Scanner(System.in);
        userInput = keyBoard.nextLine();
        System.out.println(userInput.toUpperCase());
        System.out.println(userInput.toLowerCase());
    }
}
