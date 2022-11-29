public class Break_and_Continue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (i == 15) {
                System.out.println(i);
                break;
            } else {
                System.out.println(i);
            }
            i++;
        }
        System.out.println("Конец цикла");
    }
}

