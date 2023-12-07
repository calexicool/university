package javapractice12.sev;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void getKey() {
        Scanner myScanner = new Scanner(System.in);
        String key = myScanner.next();
        printDetails(key);
    }

    public static void printDetails(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception var2) {
            throw var2;
        }
    }

    private static String getDetails(String key) {
        if (key == "") {
            try {
                throw new Exception("Key set to empty string");
            } catch (Exception var2) {
                var2.printStackTrace();
            }
        }

        return "data for " + key;
    }

    public static void main(String[] args) {
        getKey();
    }
}