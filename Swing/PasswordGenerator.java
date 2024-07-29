package Swing;

import java.util.Random;
// me
public class PasswordGenerator {
    public static final String LOWERCASE_CHARS = "abcdefghijklmnopqrstuvwxyz";
    public static final String UPPERCASE_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERs = "0123456789";
    public static final String SPECIAL_CHARS = "!@#$%^&*()_+-={}[]|;:<,>.?/÷≥≤…“‘«≠–º";

    private final Random random;

    public PasswordGenerator() {
        random = new Random();
    }

    public String GeneratePassword(int Length, boolean IncludeUpperCase, boolean IncludeLowerCase, boolean IncludeNumbers, boolean IncludeSymbols) {
        StringBuilder PasswordGen = new StringBuilder();

        String validChars = "";
        if (IncludeUpperCase) validChars += UPPERCASE_CHARS;
        if (IncludeLowerCase) validChars += LOWERCASE_CHARS;
        if (IncludeNumbers) validChars += NUMBERs;
        if (IncludeSymbols) validChars += SPECIAL_CHARS;

        // building the password

        for (int i = 0; i < Length; i++) {
            int randomIndex = random.nextInt(validChars.length());

            char randomChar = validChars.charAt(randomIndex);

            PasswordGen.append(randomChar);

        }

        return PasswordGen.toString();
        
    }
}
