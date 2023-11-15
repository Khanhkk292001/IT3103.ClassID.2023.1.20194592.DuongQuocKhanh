// Dương Quốc Khánh - 20194592
package week3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



class NoGarbage {
    public static void main(String[] args) {
        createNoGarbage();
    }

    public static void createNoGarbage() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            stringBuilder.append(generateRandomString()); // This line does not create unnecessary garbage
        }
        String noGarbage = stringBuilder.toString();
        System.out.println("No Garbage created!");
    }

    public static String generateRandomString() {
        return Long.toHexString(Double.doubleToLongBits(Math.random()));
    }
}
