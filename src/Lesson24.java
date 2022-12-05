public class Lesson24 {
    public static void main(String[] args) {
        /*
        Варианты форматированные строк
         */
        System.out.printf("This is a string, %s", "NICE"); //%s - для вставки строки
        System.out.printf("This is a string, %d", 2); // %d - для вставки цифрового значения
        System.out.printf("This is a string, %f", 2.11); // %f - для вставки float
        System.out.println();
        System.out.printf("%f This is a string, %s, %d", 2.11, "String", 10);
        System.out.println();
        System.out.printf("String %4d \n",3); //%8d - зарезервировать 8 знаков под значение выводимого параметра
        System.out.printf("String %4d \n",312);
        System.out.printf("String %4d \n",32);
        System.out.printf("String %4d \n",3341);
        System.out.printf("String %-4d \n",3); //%8d - зарезервировать 8 знаков под значение выводимого параметра
        System.out.printf("String %-4d \n",312); //%-4d - выравнивание числа в поле из 4 знаков по правому краю
        System.out.printf("String %-4d \n",32);
        System.out.printf("String %-4d \n",3341);

        System.out.printf("String %.2f \n",12.121212); //округление до Х знаков после запятой
        System.out.printf("String %.4f \n",3341.12121121);

        System.out.printf("String %015.2f \n",3341.12121121);



    }
}
