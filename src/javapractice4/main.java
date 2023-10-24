package javapractice4;
import java.util.Scanner;

public class main {
    public static void main(String [] args){
        phone first = new phone(97744266, "iphone 14", 352);
        phone second = new phone(2342343,"Samsung",437);
        phone third = new phone(3242455,"Nokia",230);
        Scanner sc = new Scanner(System.in);
        first.setName(sc.nextLine());
        second.setName(sc.nextLine());
        third.setName(sc.nextLine());
        System.out.println("Звонит "+ first.receiveCall());
        System.out.println("Звонит "+ second.receiveCall());
        System.out.println("Звонит "+ third.receiveCall());
        System.out.println(first.toString());

    }
}
