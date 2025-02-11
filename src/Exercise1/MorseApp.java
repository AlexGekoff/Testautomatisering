package Exercise1;

import java.util.Scanner;

public class MorseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MorseConverter converter = new MorseConverter();

        while (true) {
            System.out.println("Välj ett alternativ:");
            System.out.println("1: Text till morsekod");
            System.out.println("2: Morsekod till text");
            System.out.println("3: Avsluta");

            String input = scanner.nextLine();

            try {
                int choice = Integer.parseInt(input);

                if (choice == 1) {
                    System.out.println("Ange text:");
                    String text = scanner.nextLine();
                    System.out.println("Morsekod: " + converter.toMorse(text));
                } else if (choice == 2) {
                    System.out.println("Ange morsekod (separera varje bokstav med mellanslag, ex: .... . .---):");
                    String morse = scanner.nextLine();
                    System.out.println("Text: " + converter.fromMorse(morse));
                } else if (choice == 3) {
                    System.out.println("Programmet avslutas.");
                    break; //
                } else {
                    System.out.println("Ogiltigt val.");
                }
            } catch (NumberFormatException e) {
                System.out.println(("Fel: Du måste ange en siffra (1,2 eller 3)."));
            } catch (IllegalArgumentException e) {
                System.out.println("Fel: " + e.getMessage()); // Visa felmeddelande från undantag
            }

        }
        scanner.close();
    }
}

