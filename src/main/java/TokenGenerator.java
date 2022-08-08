import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {
    public static void main(String[] args) {
        String charTable = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        Random random = new Random();
        StringBuilder token = new StringBuilder();


        Scanner input = new Scanner(System.in);
        System.out.println("Which token would you like to generate? \n Enter 5, for 5-character token, " +
                           "\n Enter 10, for 10-character token, \n Enter 15, for 15-character token.");
        int userInput = input.nextInt();

        switch (userInput) {
            case 5, 10, 15 -> {
                for(int i = 0; i<userInput; i++) {
                    int index = random.nextInt(charTable.length());
                    char randomChar = charTable.charAt(index);
                    token.append(randomChar);
                }
                String generatedToken = token.toString();
                System.out.println("Your token is: " + generatedToken);
            }
            default -> System.out.println("Please try again - enter 5, 10 or 15 - to get your token");
        }
    }
}
