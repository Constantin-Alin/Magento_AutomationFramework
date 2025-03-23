package data;

import java.util.Random;

public class Email {
    static Random rnd;

    private Email() {
    }

    public static String generateRandomEmail() {
        rnd = new Random();
        int number = rnd.nextInt(10000);
        return "alin.chilom" + number + "@abc.com";
    }
}
