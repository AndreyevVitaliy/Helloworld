public class Lesson19 {
    public static void main(String[] args) {
        HumanOld human = new HumanOld();
        human.getInfo();
    }
}

class HumanOld{
    /**
     * Конструкторов класс может быть несколько
     * В данном случае отражен пример когда объект может быть создан со
     * значениями по умолчанию или с со значениями, которые указал пользователь
     */

    private String name; //переменные объекты
    private int age; //переменные объекта

    public HumanOld(){ //Конструктор класса
        this.name = "Новое имя";
        this.age = 0;
    }

    public HumanOld(String name){ //Конструктор класса
        this.name = name;
        this.age = 0;
    }

    public HumanOld(String name, int age){ //Конструктор класса
        this.name = name;
        this.age = age;
    }



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
