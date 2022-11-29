public class ClassesAndObjects {
    public static void main(String[] args) {
        Person newPerson = new Person();
        newPerson.setName("Ваня");
        newPerson.setAge(18);



        System.out.println("Меня зовут " + newPerson.getName() + " мне " + newPerson.getAge() + " лет");
        newPerson.speak();
        newPerson.sayHello();
        System.out.println(newPerson.calculateYearsToRetirement());

    }
}

/**
 * Класс Person предназначен для создания персон
 *
 *
 */
class Person {
    //у класса могут быть
    //1. Данные
    //2. Дейтвия, которые он может совершать (методы)
    private String name; //имя c private доступно только в пределах класса
    private int age; //возраст

    void speak() { //этот метод ничего не возвращает
        System.out.println(name + ", " + age);
    }

    /**
     * Метод расчета количества лет до пенсии
     * @return int
     */
    int calculateYearsToRetirement() {
        return 65 - age;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    /**
     * Метод установки имени объекта
     * @param name tyoe:String
     */
    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age < 0){
            System.out.println("Возраст введен не корректно");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}


