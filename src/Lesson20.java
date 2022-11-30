//статические методы будут востребованы тогда, когда в их задачи не входит создание объекта
//наиболее частый пример статического метода, это функция, котоая принимает какие-то значения,
//обрабатывает их и результат возвращает обратно. Хороший пример класса с такими со статическим методами
//Класс Math

import java.lang.reflect.Method;

public class Lesson20 {
    public static void main(String[] args) {

        Human h1 = new Human("Bob", 18);
        Human.printNumberOfPeople();
        Human h2 = new Human("Bob", 18);
        Human.printNumberOfPeople();

    }
}

class Human {
    /**
     * Конструкторов класс может быть несколько
     * В данном случае отражен пример когда объект может быть создан со
     * значениями по умолчанию или с со значениями, которые указал пользователь
     */

    private String name; //переменные объекты
    private int age; //переменные объекта
    public static int countPeople = 0; //переменная с признаком STATIC принадлежит классу и доступна для всех объектов
    //этого класса


    public Human(String name, int age) { //Конструктор класса
        this.name = name;
        this.age = age;
        countPeople++;
    }

    public static void printNumberOfPeople() {
        System.out.println(countPeople);
    }

    /**
     * Устанавливает имя объекта
     *
     * @param name:String
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Устанавливает возраст объекта
     *
     * @param age:integer
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Возвращает имя объекта
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает возраст объекта
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Возвращает информацию об объекте
     */
    public void getInfo() {
        System.out.println(name + ", " + age);
    }
    /*
    //      public static void getDescription(){
//          System.out.println(description);
//      }
    public void getAllField() {
        System.out.println(name + ", " + age + ", " + description);
    }
    */
//      public static void printAllField(){ //статический метод который принадлежит классу, а не объекту
//          System.out.println(name); //невозможно обращение из метода класса к переменной объекта
//      }

}


