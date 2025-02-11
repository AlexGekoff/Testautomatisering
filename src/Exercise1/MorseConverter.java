package Exercise1;

import java.util.HashMap;

public class MorseConverter {
    private static final HashMap<Character, String> textToMorse = new HashMap<>();
    private static final HashMap<String, Character> morseToText = new HashMap<>();

    static {
        textToMorse.put('A', ".-");     morseToText.put(".-", 'A');
        textToMorse.put('B', "-...");   morseToText.put("-...", 'B');
        textToMorse.put('C', "-.-.");   morseToText.put("-.-.", 'C');
        textToMorse.put('D', "-..");    morseToText.put("-..", 'D');
        textToMorse.put('E', ".");      morseToText.put(".", 'E');
        textToMorse.put('F', "..-.");   morseToText.put("..-.", 'F');
        textToMorse.put('G', "--.");    morseToText.put("--.", 'G');
        textToMorse.put('H', "....");   morseToText.put("....", 'H');
        textToMorse.put('I', "..");     morseToText.put("..", 'I');
        textToMorse.put('J', ".---");   morseToText.put(".---", 'J');
        textToMorse.put('K', "-.-");    morseToText.put("-.-", 'K');
        textToMorse.put('L', ".-..");   morseToText.put(".-..", 'L');
        textToMorse.put('M', "--");     morseToText.put("--", 'M');
        textToMorse.put('N', "-.");     morseToText.put("-.", 'N');
        textToMorse.put('O', "---");    morseToText.put("---", 'O');
        textToMorse.put('P', ".--.");   morseToText.put(".--.", 'P');
        textToMorse.put('Q', "--.-");   morseToText.put("--.-", 'Q');
        textToMorse.put('R', ".-.");    morseToText.put(".-.", 'R');
        textToMorse.put('S', "...");    morseToText.put("...", 'S');
        textToMorse.put('T', "-");      morseToText.put("-", 'T');
        textToMorse.put('U', "..-");    morseToText.put("..-", 'U');
        textToMorse.put('V', "...-");   morseToText.put("...-", 'V');
        textToMorse.put('W', ".--");    morseToText.put(".--", 'W');
        textToMorse.put('X', "-..-");   morseToText.put("-..-", 'X');
        textToMorse.put('Y', "-.--");   morseToText.put("-.--", 'Y');
        textToMorse.put('Z', "--..");   morseToText.put("--..", 'Z');
    }

    public String toMorse(String text) {
        StringBuilder morseCode = new StringBuilder();
        text = text.toUpperCase();// Konverterar hela text till stora bokstäver (A-Z), eftersom morsekoden endast definieras för stora bokstäver.
        for (char c : text.toCharArray()) {
            if (c==' ') {
                continue;} // Ignorera mellanslag

            if (Character.isLetter(c)) {
                if (textToMorse.containsKey(c)) {
                    morseCode.append(textToMorse.get(c)).append(" ");
                } else {
                    System.out.println("Fel: Ogiltigt tecken (inte definierad i morsekoden): " + c);
                }
            } else {
                // Om det inte är en bokstav, visa ett felmeddelande och fortsätt bearbeta
                System.out.println("Fel: Ogiltigt tecken (endast bokstäver tillåtna): " + c);
            }
        }
        return morseCode.toString().trim();
    }

    public String fromMorse(String morse) {

        if (!morse.matches("[.\\-\\s]+")) {
            System.out.println("Fel: Du kan bara använda . (punkt), - (streck) och mellanslag. Försök igen.");
            return ""; // Om ogiltig input, returnera en tom sträng eller välj att fortsätta.
        }

        StringBuilder text = new StringBuilder();
        String[] morseChars = morse.split(" ");

        for (String morseChar : morseChars) {
            if (morseToText.containsKey(morseChar)) {
                text.append(morseToText.get(morseChar));
            } else {
                System.out.println("Fel: Ogiltig morsekod: " + morseChar);
            }
        }
        return text.toString();
    }
}

