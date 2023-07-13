package Model;

import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;
/**
 * Класс hashModel для работы с hashMap 
 */
public class HashModel implements iGetModel {
  
    private HashMap<Long,Student> mapStudents;
/**
 * Конструктор класса для работы с hashMap
 * @param mapStudents map студентов: номер и студент
 */
    public HashModel(HashMap<Long, Student> mapStudents) {
        this.mapStudents = mapStudents;
    }
/**
 * Метод получения map студентов
 */
    public HashMap<Long,Student> getMapStudents()
    {
        return mapStudents;
    }

    @Override
    public List<Student> getAllStudents() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getAllStudents'");
    }

    @Override
    public boolean deleteStudent(int number) {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'deleteStudent'");
    }
}
