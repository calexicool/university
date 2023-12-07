package javapractice7.thir;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date birthDate;

    public Student(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String formatBirthDate(String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        return dateFormat.format(birthDate);
    }

    public String getShortBirthDate() {
        return formatBirthDate("dd.MM.yy");
    }

    public String getMediumBirthDate() {
        return formatBirthDate("dd MMM yyyy");
    }

    public String getFullBirthDate() {
        return formatBirthDate("dd MMMM yyyy");
    }

    @Override
    public String toString() {
        return "Имя:" + name + "', возраст:" + age + ", дата рождения:" + getMediumBirthDate();
    }

    public static void main(String[] args) {
        Date birthDate = new Date(2003,1,9); //
        Student student = new Student("Михаил", 20, birthDate);
        System.out.println(student.toString());
        System.out.println("короткая дата рождения: " + student.getShortBirthDate());
        System.out.println("средняя дата рождения: " + student.getMediumBirthDate());
        System.out.println("полная дата рождения: " + student.getFullBirthDate());
    }
}
