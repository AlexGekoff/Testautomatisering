package Exercise1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MorseConverterTest {
    MorseConverter converter = new MorseConverter();

    @Test
    void testToMorse() {
        assertEquals(".... . .---", converter.toMorse("hej"));
    }

    @Test
    void testFromMorse() {
        assertEquals("HELLO", converter.fromMorse(".... . .-.. .-.. ---"));
    }

    @Test
    void testEmptyInput() {
        assertEquals("", converter.toMorse("")); // Förväntar sig tom morsekod
        assertEquals("", converter.fromMorse("")); // Förväntar sig tom text
    }

    @Test
    void testLongMessage() {
        String inputText = "HELLO WORLD";
        String expectedMorseCode = ".... . .-.. .-.. --- .-- --- .-. .-.. -..";
        assertEquals(expectedMorseCode, converter.toMorse(inputText)); // Förväntar sig korrekt morsekod

    }


    @Test
    void testCaseInsensitive() {
        assertEquals(".... . .---", converter.toMorse("HeJ"));
    }


}

