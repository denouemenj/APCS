import java.util.Random;

public class PasswordGenerator {
    private int digitLen;
    private String prefix;
    private static int counter = 0;

    public PasswordGenerator(int digitLen, String prefix) {
        this.digitLen = digitLen;
        this.prefix = prefix;
    }

    public PasswordGenerator(int digitLen) {
        this.prefix = "A";
        this.digitLen = digitLen;
    }

    public String pwGen() {
        Random random = new Random();
        String pw = this.prefix + ".";
        int randomNum;

        for (int i = 1; i <= digitLen; i++) {
            randomNum = random.nextInt(10);
            pw = pw + String.valueOf(randomNum);
        }

        this.counter++;
        return pw;
    }

    public int pwCount() {
        return this.counter;
    }
}
