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

class Person {
    //у класса могут быть
    //1. Данные
    //2. Дейтвия, которые он может совершать (методы)
    String name; //имя
    int age; //возраст

    void speak() { //этот метод ничего не возвращает
        System.out.println(name + ", " + age);
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    void setName(String name) {
        this.name = name;
    }


    String getName() {
        return name;
    }

    void setAge(int age) {
        this.age = age;
    }

    int getAge() {
        return age;
    }
}


