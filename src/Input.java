import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner objScanner = new Scanner(System.in);
        System.out.println("Введите информацию:");
        int newLine = objScanner.nextInt(); //nextLine - type String, nextInt - type int
        System.out.println("Вы ввели: " + newLine);
    }
}
