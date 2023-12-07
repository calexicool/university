package javapractice7.qutr;

import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год (например, 2023):");
        int year = scanner.nextInt();

        System.out.println("Введите месяц (1-12):");
        int month = scanner.nextInt() - 1;

        System.out.println("Введите число (1-31):");
        int day = scanner.nextInt();

        System.out.println("Введите часы (0-23):");
        int hours = scanner.nextInt();

        System.out.println("Введите минуты (0-59):");
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);
        Date date = calendar.getTime();

        System.out.println("объект Date: " + date);

        System.out.println("объект Calendar: " + calendar.getTime());
    }
}
