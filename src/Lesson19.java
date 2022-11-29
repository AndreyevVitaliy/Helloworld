public class Lesson19 {
    public static void main(String[] args) {
        Human human = new Human();
        human.getInfo();
    }
}

class Human{
    /**
     * Конструкторов класс может быть несколько
     * В данном случае отражен пример когда объект может быть создан со
     * значениями по умолчанию или с со значениями, которые указал пользователь
     */
    public Human(){ //Конструктор класса
        this.name = "Новое имя";
        this.age = 0;
    }

    public Human(String name){ //Конструктор класса
        this.name = name;
        this.age = 0;
    }

    public Human(String name, int age){ //Конструктор класса
        this.name = name;
        this.age = age;
    }

    private String name;
    private int age;

    /**
     * Устанавливает имя объекта
     * @param name:String
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Устанавливает возраст объекта
     * @param age:integer
     */
    public void setAge(int age) {
        this.age = age;
    }
    /**
     * Возвращает имя объекта
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * Возвращает возраст объекта
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
}
