import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Controller.Controller;
import Controller.iGetModel;
import Controller.iGetView;
import Model.HashModel;
import Model.ModelFile;
import Model.ModelList;
import Model.Student;
import View.View;
import View.ViewEnglish;

public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");

       List<Student> students = new ArrayList<Student>();
       Student s1 = new Student("Sergey",  21, 101);
       Student s2 = new Student("Andrew",  22, 111);
       Student s3 = new Student("Yohan", 22, 121);
       Student s4 = new Student("Igor", 23, 301);
       Student s5 = new Student("Ola",  25, 171);
       Student s6 = new Student("Lena",  23, 104);
       students.add(s1);
       students.add(s2);
       students.add(s3);
       students.add(s4);
       students.add(s5);
       students.add(s6);
/**
 * Задаю hashMap со студентами
 */
       HashMap<Long,Student> mapStudents = new HashMap<>();
       mapStudents.put(1L, new Student("Анна", 21, 105));
       mapStudents.put(2L, new Student("Василий", 32, 107));

    //    ModelFile fModel = new ModelFile("StudentDB.txt");
       //fModel.saveAllStudentToFile(students);

    //    iGetModel modelFile = fModel;
       iGetModel model = new ModelList(students);
       /**
        * Задаю модель c hashMap 
         */   
       iGetModel hashModel = new HashModel(mapStudents);
       /**
        * Задаю новый view на английском
        */
       iGetView view = new ViewEnglish();

       Controller control = new Controller(model, view);
       /**
        * Задаю новый контроллер
        */
       Controller controlHash = new Controller(hashModel, view);       

       //control.update();
        controlHash.updateMap();
        
        control.run();



    }
}
