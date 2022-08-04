import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class TokenGenerator {

    public static void main(String[] args) {

        //Random token = new Random();
        //byte[] chars = new byte[5];
        //char randomToken = (char)(token.nextInt(94)); //-> ta metoda podmienia nam liczby wpisane przez uzytkownika
        // na ascii chars a powinna dawac zupelnie randomowy ciag ograniczony do 5, 10 lub 15
        //String chars = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijk"
                //+ "lmnopqrstuvwxyz!@#$%&";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 for 5-character token" +
                           "\n 10 for 10-character token" +
                           "\n 15 for 15-character token");

        int userInput = input.nextInt();
        switch (userInput) {
            case 5 -> {
                byte[] array = new byte[5]; // length is bounded by 5
                new Random().nextBytes(array);
                String shortLengthToken = new String(array, StandardCharsets.US_ASCII);
                System.out.println("Here is your 5-character token: " + shortLengthToken); // + generated token
            }
            case 10 -> {
                byte[] array = new byte[10]; // length is bounded by 10
                new Random().nextBytes(array);
                String mediumLengthToken = new String(array, StandardCharsets.US_ASCII);
                System.out.println("Here is your 10-character token: " + mediumLengthToken); // + generated token
            }
            case 15 -> {
                byte[] array = new byte[15]; // length is bounded by 15
                new Random().nextBytes(array);
                String longToken = new String(array, StandardCharsets.US_ASCII);
                System.out.println("Here is your 15-character token: " + longToken); // + generated token
            }
            default -> System.out.println("Please try again");
        }







    }
}
