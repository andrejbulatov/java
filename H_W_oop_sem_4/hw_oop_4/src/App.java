import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Controllers.EmployeeController;
import Domen.Employee;
import Domen.Person;
import Domen.PersonAverageAge;
import Domen.PersonComporator;
import Domen.Student;
import Domen.StudentGroup;
import Domen.Teacher;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {

/**
 * Создаю список преподавателей и вывожу его на печать
 */

        TeacherService listTeach = new TeacherService();

        listTeach.create("Иван", 55);
        listTeach.create("Игорь", 43);        
        listTeach.create("Anna", 65);
        listTeach.create("Игорь", 73);        

        listTeach.printTeachLst();
/**
 * СОртирую список и опять вывожу на печать
 */
        listTeach.sortByFIOTeachLst();
        System.out.println("=========================================================");
        listTeach.printTeachLst();       

/**
 * Добавил еще экземпляров студентов
 */
        Student s1 = new Student("Илья", 21, 221);
        Student s2 = new Student("Гоша", 23, 801);
        Student s3 = new Student("Маша", 20, 1921);
        Student s4 = new Student("Оля",  23, 144);
        Student s5 = new Student("Андрей",  24, 271);
        Student s6 = new Student("Леся",  23, 304);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
        /**
         * Создаю группу студентов для подсчета среднего возраста
         */
        PersonAverageAge<Student> groupStudents = new PersonAverageAge<Student>();
        groupStudents.averageAge(listStud1);
        System.out.println("=========================================================");
        /**
         * Вызываю метод подсчета и вывода на печать
         */
        groupStudents.averageResult();

    }
}