import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // your code here
        System.out.println("Hello user! How old are you?: ");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        if (userInput < 0) {
            System.out.println("You are literally too young to exist :P ");
        }
        else if (userInput > 18) {
            System.out.println("Wow you are older than 18 years old!");
        }
        else if (userInput < 18 && userInput >= 10) {
            System.out.println("You are too young to be greeted as an adult!");
        }
        else if (userInput < 18 && userInput < 10) {
            System.out.println("This is a very special message for a very young person! (Under 10 years old)");
        }
        else {
            System.out.println("Hello fellow teen! You are exactly 18 years old!");
        }
    }
}
