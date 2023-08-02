package Model;
/**
 * Класс InvalidInputException унаследованный от класса Exception для обработки исключения с некорректным вводом данных для операции
 * возведения в степень
 */
public class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}
