package javapractice2;
public class TestAuthor {
    public static void main(String [] args){
        Author author = new Author("Artur",'M');
        author.setEmail();
        System.out.println(author.toString());
    }
}
