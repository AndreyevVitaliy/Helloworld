package Interfaces;

public class Person implements Info {
    public String name;

    public Person(String name) {//cmd + N - создание конструктора
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    @Override
    public void showInfo() {
        System.out.println("Name is " + this.name);
    }
}
