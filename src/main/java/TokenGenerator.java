import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {
    public static void main(String[] args) {
        String charTable = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()";
        StringBuilder shortToken = new StringBuilder();
        Random random = new Random();

        Scanner input = new Scanner(System.in);
        System.out.println("which token would you like to generate? \n - 5, 10 or 15 characters?");
        int userInput = input.nextInt();

        switch (userInput) {
            case 5 -> {
                int shortLength = 5;
                for(int i = 0; i<shortLength; i++) {
                    int index = random.nextInt(charTable.length());
                    char randomChar = charTable.charAt(index);
                    shortToken.append(randomChar);
                }
                String shortToken1 = shortToken.toString();
                System.out.println("your token is: " + shortToken1);
            }
            case 10 -> {
                int midLength = 10;
                for(int i = 0; i<midLength; i++) {
                    int index = random.nextInt(charTable.length());
                    char randomChar = charTable.charAt(index);
                    shortToken.append(randomChar);
                }
                String shortToken2 = shortToken.toString();
                System.out.println("your token is: " + shortToken2);
            }
            case 15 -> {
                int longLength = 15;
                for(int i = 0; i<longLength; i++) {
                    int index = random.nextInt(charTable.length());
                    char randomChar = charTable.charAt(index);
                    shortToken.append(randomChar);
                }
                String shortToken3 = shortToken.toString();
                System.out.println("your token is: " + shortToken3);
            }
            default -> System.out.println("Please try again - enter 5, 10 or 15 - to get your token");
        }
    }
}
