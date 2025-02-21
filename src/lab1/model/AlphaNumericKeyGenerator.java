package lab1.model;

import lab1.interfaces.VerificationKeyGenerator;

import java.util.Random;

public class AlphaNumericKeyGenerator implements VerificationKeyGenerator {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final Random RANDOM = new Random();

    @Override
    public String generateKey() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            stringBuilder
                    .append(CHARACTERS
                            .charAt(RANDOM.nextInt(CHARACTERS.length())));
        }
        return stringBuilder.toString();
    }

    @Override
    public String getFileName() {
        return "AlphaNumericKeys.txt";
    }
}
