import java.util.Scanner;

public class Greeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String text = scanner.nextLine();
     
        System.out.println("Hi " + text);
        scanner.close();

    }
}