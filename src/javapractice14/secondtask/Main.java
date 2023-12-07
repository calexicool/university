package javapractice14.secondtask;

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main (String [] args){
        LinkedList <String> my_list = new LinkedList<String>();
        my_list.add("Солнце");
        my_list.add("Луна");
        my_list.add("Марс");
        my_list.add("Венера");
        for (String element : my_list){
            System.out.println(element);
        }
        my_list.addLast("Плутон");
        Collections.shuffle(my_list);
    }
}
