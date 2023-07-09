package Domen;

/**
 * Класс преподаватель наследованный от класса с персонами
 */
public class Teacher extends Person {

    private String acadDegree;
    private int id;
/**
 * Констурктор класса Преподаватель
 * @param firstName Имя
 * @param age возраст
 * @param degree ученая степень
 * @param id идентификатор
 */
    public Teacher(String firstName, int age, String degree, int id) {
        super(firstName, age);
        this.acadDegree = degree;
        this.id = id;
    }
}
