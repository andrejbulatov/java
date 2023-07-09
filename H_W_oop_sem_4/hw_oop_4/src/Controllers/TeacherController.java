package Controllers;

import Domen.Teacher;
import Services.TeacherService;
/**
 * Класс контроллер для учителей, имплементированный от интерефейса iPersonController
 */
public class TeacherController implements iPersonController <Teacher> {

      private final TeacherService dataService = new TeacherService();

    /**
     * Метод регистрации преподавателей в базе данных
     */
    @Override
    public void create(String firstName, int age) {
        dataService.create(firstName,age);
        dataService.sortByFIOTeachLst();
    }
}
