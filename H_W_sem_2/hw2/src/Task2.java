import java.io.IOException;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.*;

public class Task2 {
  // Метод для второго задания сотрировка массива
  public static void sortingMassiveByBubbleMethod(int[] inputArray) throws SecurityException, IOException {
    int countIterations = 0;
    int temporaryValue = 0;
    String stringLog = "";

    while (countIterations < inputArray.length - 2) {
      for (int i = 0; i < inputArray.length - 1; i ++) {
          if (inputArray[i] > inputArray[i + 1]) {
            stringLog = "";
            temporaryValue = inputArray[i];
            inputArray[i] = inputArray[i + 1];
            inputArray[i + 1] = temporaryValue;
            stringLog = Integer.toString(inputArray[i]) + " changed with " + Integer.toString(inputArray[i + 1]);
            startLogger(stringLog);
          }
      }
      countIterations ++;
    }
  }

  // Метод для логирования
  public static void startLogger(String messageLog) throws SecurityException, IOException {
    Logger logger = Logger.getLogger(Task2.class.getName());
    logger.setLevel(Level.INFO);
  // Запись в файл логов
    Handler fileHandler = new FileHandler("log.txt");
    logger.addHandler(fileHandler);    
    SimpleFormatter sFormat = new SimpleFormatter();
    fileHandler.setFormatter(sFormat);
    logger.info(messageLog);

  }
  
}
