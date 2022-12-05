package Animals;


import java.time.chrono.IsoEra;

public class Dog extends Animal {
    public void bark() {
        System.out.println("Я Лаю");
    }

    public void eat() {
        System.out.println("Я кушаю");;
    }

    @Override //анотация, которая говорит что ниже описанный метод, должен переопределять метод своего родителя
                //фактически проверят, есть ли метод с таким наименованием в классе родителе
                // наличие необходимо, если мы действительно хотим поменять метод родителя
    public void sleep() {

    }

    public void showName(){
        System.out.println(name);
    }

    public void setName(String name){
        this.name = name;
    }
}
