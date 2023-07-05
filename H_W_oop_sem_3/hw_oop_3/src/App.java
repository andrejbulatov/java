import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import Domen.Student;
import Domen.StudentGroup;
import Domen.StudentStream;

public class App {
    public static void main(String[] args) throws Exception {

        Student s1 = new Student("Иван", 25, 121);
        Student s2 = new Student("Игорь", 23, 301);
        Student s3 = new Student("Иван", 22, 121);
        Student s4 = new Student("Игорь",  23, 444);
        Student s5 = new Student("Даша",  23, 171);
        Student s6 = new Student("Лена",  23, 104);
/**
 * Добавил еще экземпляров студентов
 */
        Student s7 = new Student("Илья", 21, 221);
        Student s8 = new Student("Гоша", 23, 801);
        Student s9 = new Student("Маша", 20, 1921);
        Student s10 = new Student("Оля",  23, 144);
        Student s11 = new Student("Андрей",  24, 271);
        Student s12 = new Student("Леся",  23, 304);
        Student s13 = new Student("Леон",  23, 9004);

        List<Student> listStud1 = new ArrayList<Student>();
        listStud1.add(s1);
        listStud1.add(s2);
        listStud1.add(s3);
        listStud1.add(s4);
        listStud1.add(s5);
        listStud1.add(s6);
/**
 * Создал и наполнил списки студентов
 */        
        List<Student> listStud2 = new ArrayList<Student>();
        listStud2.add(s7);
        listStud2.add(s8);
        listStud2.add(s9);

        List<Student> listStud3 = new ArrayList<Student>();        
        listStud3.add(s10);
        listStud3.add(s11);
        listStud3.add(s12);
        listStud3.add(s13);
/**
 * Добавил экземпляры групп студентов
 */
        StudentGroup group4580 = new StudentGroup(listStud1, 4580);
        StudentGroup group4581 = new StudentGroup(listStud2, 4581);
        StudentGroup group4590 = new StudentGroup(listStud3, 4590);        
/**
 * Создал список групп и наполнил их
 */
        List<StudentGroup> listGroup1 = new ArrayList<StudentGroup>();
        listGroup1.add(group4580);
        listGroup1.add(group4581);
        listGroup1.add(group4590);
/**
 * Создал экземпляр потока с группами студентов
 */
        StudentStream stream1 = new StudentStream(listGroup1, 1);       

/**
 * Вывожу итератором группы по порядку и в каждой группе список студентов
 */
        for(StudentGroup stdGr : stream1)
        {
            System.out.println("Number of group " + stdGr.getIdGroup());
            for(Student std : stdGr) {
                System.out.println(std);
            }
        }

        System.out.println("=========================================================");
/**
 * Отсортировал группы в потоке по количеству студентов и снова вывел группы со списком студентов
 */
        Collections.sort(stream1.getStream());

        for(StudentGroup stdGr : stream1)
        {
            System.out.println("Number of group " + stdGr.getIdGroup());
            for(Student std : stdGr) {
                System.out.println(std);
            }
        }        
    }
}