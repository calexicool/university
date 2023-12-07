package javapractice11.sec;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число: ");
        int n = sc.nextInt();
        printDigitsFromRightToLeft(n);
    }

    public static void printDigitsFromRightToLeft(int n) {
        if (n == 0)
            return;
        printDigitsFromRightToLeft(n / 10);
        System.out.println(n % 10);
    }
}
