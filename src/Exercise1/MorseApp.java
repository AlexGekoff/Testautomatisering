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

                switch (choice) {
                    case 1:
                        System.out.println("Ange text:");
                        String text = scanner.nextLine();
                        System.out.println("Morsekod: " + converter.toMorse(text));
                        break;
                    case 2:
                        System.out.println("Ange morsekod (separera varje bokstav med mellanslag, ex: .... . .---):");
                        String morse = scanner.nextLine();
                        System.out.println("Text: " + converter.fromMorse(morse));
                        break;
                    case 3:
                        System.out.println("Programmet avslutas.");
                        scanner.close();
                        return; // Gör en "return" för att avsluta programmet
                    default:
                        System.out.println("Ogiltigt val.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Fel: Du måste ange en siffra (1, 2 eller 3).");
            } catch (IllegalArgumentException e) {
                System.out.println("Fel: " + e.getMessage()); // Visa felmeddelande från undantag
            }
        }
    }
}
