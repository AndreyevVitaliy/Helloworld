import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        int value;
        do {
            System.out.println("Введите число 5");
            value = objScanner.nextInt();
        } while (value!=5);
        System.out.println("Вы ввели число " + value);

    }
}
