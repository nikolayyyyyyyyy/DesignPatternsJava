package lab1.model;

import lab1.interfaces.VerificationKeyGenerator;

public class Application {
    public static void main(String[] args) {
        VerificationKeyGenerator numeric = new NumericKeyGenerator();
        VerificationKeyGenerator alphaNumeric = new AlphaNumericKeyGenerator();

        String first = numeric.generateKey();
        String second = alphaNumeric.generateKey();

        FileManager.saveKey(numeric.getFileName(),first);
        FileManager.saveKey(alphaNumeric.getFileName(),second);


        boolean b1 = FileManager.verifyAndRemoveKey(numeric.getFileName(), first);
        boolean b = FileManager.verifyAndRemoveKey(alphaNumeric.getFileName(), second);
    }
}
