package javapractice14.firsttask;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main (String [] args ){
        ArrayList<String> tran = new ArrayList<String>();
        tran.add("Яблоко");
        tran.add("Арбуз");
        tran.add("Оранжевый");
        System.out.println(tran);
        tran.remove(0);
        System.out.println(tran);
        Collections.sort(tran);
        tran.get(0);
    }
}
