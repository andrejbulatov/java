package Controller;

import java.util.HashMap;
import java.util.List;

import Model.Student;

public interface iGetModel {

    public List<Student> getAllStudents();
/**
 * Метод получения hashMap студентов
 * @return
 */
    public HashMap<Long,Student> getMapStudents();
/**
 * Метод удаления студента по id
 * @param studentId идентификатор студента
 * @return
 */
    public boolean deleteStudent(int studentId);
}
