package View;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;
/**
 * Класс view на английском имплементированный с интерфейсом iGetView
 */
public class ViewEnglish implements iGetView {
/**
 * Метод печати списка студентов
 */
    public void printAllStudents(List<Student> students)
    {
        System.out.println("------It's a list of students--------");
        for(Student stud: students)
        {
            System.out.println(stud);
        }
        System.out.println("===============================");
    }
/**
 * Переопределение метода запроса у пользователя команды и считывания, что он ввел
 */
    @Override
    public String prompt(String msg) {

        Scanner in = new Scanner(System.in);
        System.out.print(msg);
        return in.nextLine();
    }
/**
 * Другие переопределенные методы из интерфейса iGetView
 */
    @Override
    public Long getStudentIdToDelete() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToDelete'");
    }

    @Override
    public void displayStudents(List<Student> students) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'displayStudents'");
    }

    @Override
    public Student readStudent() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'readStudent'");
    }

    @Override
    public Long getStudentIdToUpdate() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getStudentIdToUpdate'");
    }
/**
 * Метод вывода пользователю подскажи о том, что ему надо ввести команду
 */
    @Override
    public String askCommand() {
        return "Input command: ";
    }
/**
 * Метод вывода пользователю сообщения о выходе из программы
 * @return
 */
    @Override
    public String promptExitProgramm() {
        return "Exit from program!";
    }
/**
 * Переопределение метода печати hashMap
 */
    @Override
    public void printMapStudents(HashMap<Long, Student> mapStudents) {

        System.out.println("------It's a map of students--------");
        for(Long item: mapStudents.keySet()) {

            System.out.println(mapStudents.get(item));
        }
        System.out.println("===============================");

        }

        /**
         * Переопределен метод вывода сообщения о необходимости ввода id студента
         */
    @Override
    public String askIdStudent() {
        return "Input Student's ID ";
    }

    /**
     * Переопределен метод вывода сообщения, что такого студента с таким id нет
     */
    @Override
    public String notIdStudent() {
        return "There is no student with this ID ";
    }
    
}
