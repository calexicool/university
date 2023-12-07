package javapractice12.fiv;

public class Main {
    public Main() {
    }

    public static void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails!");
            }
        } catch (Exception var2) {
            System.out.println("It's works");
        }

    }

    public static void main(String[] args) {
        getDetails((String)null);
    }
}