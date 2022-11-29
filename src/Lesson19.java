public class Lesson19 {
    public static void main(String[] args) {
        Human human = new Human();
        human.setAge(18);
        human.setName("Tom");
        human.getInfo();
    }
}

class Human{
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
