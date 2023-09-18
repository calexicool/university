package javapractice;
import java.util.Scanner;


// Здравствуйте, я пропустил два задания, а именно 5 и 7, потому что в 5 не понял что делать, а 7 не знаю как



public class m {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        double sum = 0, average = 0;
        int s1, b = 0,max_value=0;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        average = sum / array.length;
        System.out.println("Сумма элементов массива в цикле: \n" + sum + "\nСреднее арифметическое: \n" + average + "\n");
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        b = 0; // Сбросим b в 0 перед использованием
        sum = 0;
        System.out.println("Заполните массив 10 числами: \n");
        do {
            s1 = sc.nextInt();
            arr[b] = s1;
            sum += arr[b];
            b++;
        } while (b != 10);
        int i =0;
        max_value=arr[0];
        while (i<b){
            if (arr[i]>max_value)
                max_value= arr[i];
            i++;
        }
        System.out.println("Сумма элементов массива arr:\n" + sum + "\nМаксимальный элемент массива:\n" + max_value + "\nГармонический ряд:");
        for (int l = 1; l <= 10; l++) {
            double harmonic = 1.0 / l;
            System.out.printf("1/%d = %.2f%n", l, harmonic);
        }
    }
}
