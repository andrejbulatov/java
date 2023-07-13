package Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import Model.ModelList;
import Model.Student;
import View.ViewEnglish;

public class Controller {

    private iGetModel model;
    private iGetView view;
    private List<Student> students = new ArrayList<>();
    /**
     * Задаю hashMap студентов
     */
    private HashMap<Long,Student> mapStudents = new HashMap<>();

    public Controller(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    private boolean testData(List<Student> students)
    {
        if(students.size() > 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void update()
    {
        // //MVP
        // students = model.getAllStudents();
        // if(testData(students))
        // {
        //    view.printAllStudents(students);
        // }
        // else
        // {
        //     System.out.println("Список студентов пуст!");
        // }

        // //MVC
        view.printAllStudents(model.getAllStudents());
    }
/**
 * Соединяю view и hashModel
 */
    public void updateMap()
    {

        view.printMapStudents(model.getMapStudents());

    }
    public void run()
    {
        Command com = Command.NONE;
        boolean getNewIteration = true;
        while(getNewIteration)
        {
            String command = view.prompt(view.askCommand());
            com = Command.valueOf(command.toUpperCase());
            switch(com)
            {
                case EXIT:
                    getNewIteration=false;
                    System.out.println(view.promptExitProgramm());
                    break;
                case LIST:
                    view.printAllStudents(model.getAllStudents());
                    break;
                    /**
                     * Реализована функци удаления. Преобразую номер студента в int и вызываю метод из modelList по удалению студента по id
                     * Проверяю, если такого номера нет, то вывожу сообщение из view
                     */
                case DELETE:
                    int numberStudent = Integer.parseInt(view.prompt(view.askIdStudent()));
                    boolean isDeleted = model.deleteStudent(numberStudent);
                        if (!isDeleted) {
                          System.out.println(view.notIdStudent());
                      }
            }
        }
    }
    
}
