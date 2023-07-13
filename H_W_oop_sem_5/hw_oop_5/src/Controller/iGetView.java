package Controller;

import java.util.HashMap;
import java.util.List;

import Model.Student;

public interface iGetView {

    void printAllStudents(List<Student> students);

    // Метод для запроса ввода пользователя, чтобы получить команду или данные от него
    String prompt(String msg);
/**
 * Метод вывода пользователю сообщения о запросе у пользователя команды
 * @return
 */
    String askCommand();
/**
 * Метод вывода пользователю сообщения о выходе из программы
 * @return
 */
    String promptExitProgramm();
/**
 * Метод печати map студентов
 * @param mapStudents hashMap студентов
 */
    void printMapStudents(HashMap<Long,Student> mapStudents);
/**
 * Метод вывода пользователю сообщения о запросе у пользователя id студента
 * @return
 */
    String askIdStudent();

    /**
 * Метод вывода пользователю сообщения о том, что id студента для удаления отсутствует
 * @return
 */
    String notIdStudent();

    // Метод для получения id студента, которого нужно удалить.
    Long getStudentIdToDelete();

    // Метод отображает информацию о каждом студенте
    void displayStudents(List<Student> students);

    // Метод для чтения данных о студенте.
    Student readStudent();

    // Метод для получения id студента, которого пользователь хочет обновить.
    Long getStudentIdToUpdate();
    
}
