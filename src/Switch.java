import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scanner.nextInt();
        switch (age) {
            case 0:
                System.out.println("0");
                break;
            case 7:
                System.out.println("7");
                break;
            case 18:
                System.out.println("18");
                break;
            default:
                System.out.println("условие не выполнено");
        }


    }
}