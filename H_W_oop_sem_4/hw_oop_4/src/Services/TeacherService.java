package Services;

import java.util.ArrayList;
import java.util.List;

import Domen.PersonComporator;
import Domen.Teacher;

public class TeacherService implements iPersonService <Teacher> {

    private int count;
    private List<Teacher> teachers;

    public TeacherService() {
        this.teachers = new ArrayList<Teacher>();
    }
/**
 * Переоределение метода получения списка преподавателей
 */
    @Override
    public List <Teacher> getAll() {
        return teachers;
    }
/**
 * Переопределение метода регистрации преподавателя в базе данных
 */
    @Override
    public void create(String firstName, int age) {
        Teacher per = new Teacher(firstName, age, "PhD", count);
        count++;
        teachers.add(per);
    }
/**
 * Метод сортировки преподавателей с использованием обощенного класса PersonComporator
 */
    public void sortByFIOTeachLst() {

        teachers.sort(new PersonComporator<Teacher>());

    }
/**
 * Метод печати списка преподавателей
 */
    public void printTeachLst() {

        for(Teacher teacher : teachers) {

            System.out.println(teacher);

        }

    }
  
}
