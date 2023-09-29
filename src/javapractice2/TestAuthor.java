package javapractice2;
import java.util.Scanner;
public class TestAuthor {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        Author author = new Author("Artur","calexicool@ya.ru",'M');
        author.setEmail(sc.nextLine());
        System.out.println(author.toString());
    }
}
