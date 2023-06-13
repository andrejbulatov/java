import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
    // Задача 1
    // Дана строка sql-запроса "select * from students where ". Сформируйте часть WHERE этого запроса, используя StringBuilder. 
    // Данные для фильтрации приведены ниже в виде json-строки. записываем StringBuilder
    // Если значение null, то параметр не должен попадать в запрос.
    // Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"} сплит


    // Задаем исходные параметры
    String stringRequestBeginning = "select * from students where ";
    String filterParametersJson = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
    // Вызываем методы и складываем строки 
    String cleanString = Task1.cleanStringFromBracketsAndQuotes(filterParametersJson);
    String readyCleanParametersForWhere = Task1.formingStringWithParameters(cleanString);
    String requestFull = stringRequestBeginning + readyCleanParametersForWhere;
    // Выводим результирующий запрос
    System.out.println("Task1");  
    System.out.println(requestFull);
    System.out.println();

    // Задача 2
    // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
    // Взять из презентации тему. Записываем в лог файл какой элемент с каким меняем
    
    // Задаю исходный массив
    int[] inputArray = new int[] { 1, 6, 3, 4, 5, 10, 7, 16, 3 };
    
    // Вызываю метод для сортировки массива методом пузырька
    System.out.println("Task2");     
    Task2.sortingMassiveByBubbleMethod(inputArray);
    System.out.println(Arrays.toString(inputArray));

    }

}



