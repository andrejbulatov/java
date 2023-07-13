package Model;

import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;

import Controller.iGetModel;

public class ModelList implements iGetModel {
  
    private List<Student> students;

    public ModelList(List<Student > students) {
        this.students = students;
    }

    public List<Student> getAllStudents()
    {
        return students;
    }

    @Override
    public HashMap<Long, Student> getMapStudents() {
      // TODO Auto-generated method stub
      throw new UnsupportedOperationException("Unimplemented method 'getMapStudents'");
    }
/**
 * Переопределение метода удаления студента по id
 */
    @Override
    public boolean deleteStudent(int studentId) {
        for (int i = 0; i < students.size(); i ++){
            if (students.get(i).getId() == studentId) {
                students.remove(i);
                return true;
            }
        }
        return false;
    }
}
