package javapractice2;
import java.util.Scanner;
public class Author {
    private String name;
    private String email;
    private char gender;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail() {
        Scanner sc = new Scanner(System.in);
        email = sc.nextLine();
    }


    public char getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return  name + " (" + gender + ") at " + email;
    }

    public Author(String name,  char gender) {
        this.name = name;
        this.gender = gender;
    }
}
