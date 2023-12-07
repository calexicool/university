package javapractice12.six;

public class Main {
    public Main() {
    }

    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public static String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (Exception var2) {
            System.out.println("Some Exception");
        }

        return "data for " + key;
    }

    public static void main(String[] args) {
        printMessage("True value");
        printMessage((String)null);
    }
}