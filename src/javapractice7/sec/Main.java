package javapractice7.sec;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date currentDate = new Date();
        System.out.println("Текущая дата и время: " + dateFormat.format(currentDate));
        System.out.print("Введите дату и время в формате (yyyy-MM-dd HH:mm:ss): ");
        String userInput = sc.nextLine();

        try {
            Date userDate = dateFormat.parse(userInput);
            if (userDate.before(currentDate)) {
                System.out.println("Введенная дата прошла.");
            } else if (userDate.after(currentDate)) {
                System.out.println("Введенная дата в будущем.");
            } else {
                System.out.println("Введенная дата совпадает с текущей датой.");
            }
        } catch (ParseException e) {
            System.err.println("Ошибка при парсинге даты. Проверьте формат ввода.");
        }
    }
}
