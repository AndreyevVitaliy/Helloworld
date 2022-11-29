public class Array_of_Strings {
    public static void main(String[] args) {
        String[] strings = new String[5];
        strings[0] = "Привет";
        strings[1] = "пока";
        strings[2] = "Java";
//        for (int i = 0; i < strings.length; i++){
//            System.out.println(strings[i]);
//        }

        for (String string:strings){  // где String - тип данных, string - переменная с которой будем рабоать в цикле
            System.out.println(string);
        }

        int[] numbers1 = {1,2,3};
        int sum = 0;
        for (int x: numbers1){ //для каждого x из массива numbers1
            sum = sum + x;
        }
        System.out.println(sum);
    }
}
