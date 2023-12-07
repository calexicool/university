package javapractice11.fir;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static int recursiveFun(ArrayList <Integer> my_list, int countIterator){
        for (int i = countIterator; i < my_list.size();) {
            countIterator ++;
            my_list.remove(i);
            return recursiveFun(my_list, countIterator);
        }
        if (my_list.get(my_list.size()-1) == 0)
            my_list.remove(my_list.size()-1);
        System.out.println(my_list);
        return -1;
    }

    public static void main (String [] args){
        ArrayList <Integer> my_list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите последовательность:");
        String input = sc.nextLine();
        String [] array = input.split("");
        for (int i = 0; i < input.length();i++){
            my_list.add(Integer.parseInt(array[i]));
        }
        recursiveFun(my_list, 1);
    }
}
