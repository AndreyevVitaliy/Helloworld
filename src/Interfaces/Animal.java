package Interfaces;

public class Animal implements Info { //Класс может реализовывать несколько интерфейсов. Пишутся через ","
    public int id;

    public Animal(int  id){
        this.id = id;
    }
    public void sleep(){
        System.out.println("I am sleeping");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
