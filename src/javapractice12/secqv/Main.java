package javapractice12.secqv;

import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter an integer ");
        String intString = myScanner.next();

        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException var7) {
            System.out.println("ERR");
        } catch (Exception var8) {
            System.out.println("ERR1");
        } finally {
            System.out.println("fin");
        }

    }

    public static void main(String[] args) {
        exceptionDemo();
    }
}