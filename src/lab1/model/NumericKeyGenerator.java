package lab1.model;
import lab1.interfaces.VerificationKeyGenerator;
import java.util.Random;

public class NumericKeyGenerator implements VerificationKeyGenerator {
    private static final Random RANDOM = new Random();

    @Override
    public String generateKey() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            sb.append(RANDOM.nextInt(10));
        }
        return sb.toString();
    }

    @Override
    public String getFileName() {
        return "NumericKeys.txt";
    }
}
