package Solution;

import java.util.Arrays;

public class Task_1 {
  // Первый метод - разделяем массив на части, пока он не будет равен 1 элементу
    public static int [] sortArray(int[] arrayInput){ // сортировка Массива который передается в функцию
    // проверяем не нулевой ли массив
        if (arrayInput == null) {
            return null;
        }
    // проверяем не 1 ли элемент в массиве
        if (arrayInput.length <= 1) {
            return arrayInput; // возврат в рекурсию в строки ниже см комменты.
        }
    // копируем левую часть от начала до середины
        int [] arrayFirstHalfFromInput = Arrays.copyOfRange(arrayInput, 0, arrayInput.length / 2);
    // копируем правую часть от середины до конца массива, вычитаем из длины первую часть
        int [] arraySecondHalfFromInput = Arrays.copyOfRange(arrayInput, arrayFirstHalfFromInput.length, arrayInput.length);
    // рекурсией закидываем поделенные обе части обратно в наш метод, он будет крутится до тех пор,
    // пока не дойдет до 1 элемента в массиве, после чего вернется в строку и будет искать второй такой же,
    // точнее правую часть от него и опять вернет его назад
        return mergeArray(sortArray(arrayFirstHalfFromInput), sortArray(arraySecondHalfFromInput));
      }
  // Второй метод - слияние отсортированных элементов
    public static int [] mergeArray(int [] arrayFirstHalfFromInput, int [] arraySecondHalfFromInput) {
    //Создаем новый массив длинной как сумма двух исходных
        int [] arrayResult = new int[arrayFirstHalfFromInput.length + arraySecondHalfFromInput.length];
    // введем индексы позиции для каждого массива
        int positionFirst = 0, positionSecond = 0, positionResult = 0;
    // Берется первый массив и второй массив, и берется первый элемент, 
    // сравнивается больше элемент номер 1 в первом массиве и элемент номер 1 во втором массиве
    // Меньший из них кладется в результирующий массив
    // Дальше сравнивается текущий элемент из массива, из которого не записали элемент в результирующий массив и следующий элемент из массива,
    // из которого элемент записали в результирующий
        while (positionFirst < arrayFirstHalfFromInput.length && positionSecond < arraySecondHalfFromInput.length) {
            if (arrayFirstHalfFromInput[positionFirst] < arraySecondHalfFromInput[positionSecond]) {
                arrayResult[positionResult++] = arrayFirstHalfFromInput[positionFirst++];
            }
            else arrayResult[positionResult++] = arraySecondHalfFromInput[positionSecond++];
        }

        while (positionResult < arrayResult.length) {
            if (positionFirst != arrayFirstHalfFromInput.length) {
                arrayResult[positionResult++] = arrayFirstHalfFromInput[positionFirst++];
            }
            else arrayResult[positionResult++] = arraySecondHalfFromInput[positionSecond++];
        }

        return arrayResult;
    }
}
