package javapractice7.fir;

import java.util.Date;
import java.util.Calendar;
public class Main {
    public static void main(String [] args){
        Date date = new Date();
        Calendar stdate = Calendar.getInstance();
        stdate.set(2023,9,10);
        System.out.println("Мятишкин \n" + "Дата получения\n" + stdate.getTime() + "\nДата сдачи\n" + date);
    }
}
