package data;

import java.util.Random;

public class StreetAddress {
    static Random rnd;

    private StreetAddress() {
    }

    public static String generateRandomAddress() {
        rnd = new Random();
        int number = rnd.nextInt(10000);
        return number + "Aaron Smith Drive";
    }
}
