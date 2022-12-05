package Interfaces;

public class Test {
    public static void main(String[] args) {
//        Animal animal1 = new Animal(1);
//        Person person1 = new Person("Bob");
////        animal1.sleep();
////        person1.sayHello();
//        animal1.showInfo();
//        person1.showInfo();
        Info info1 = new Animal(1); //мы можем так ссылаться только потому, что эти классы реализуют интерфейс Info
        Info info2 = new Person("Bob");
        info1.showInfo();
        info2.showInfo();

        //нам важно только то, что имеют классы от интерфейса Info
        //где это может быть полезно?...
    }
}
