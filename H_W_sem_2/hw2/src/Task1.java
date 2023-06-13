public class Task1 {
  // Метод для первого задания очищение строки от фигурных скобок и кавычек, выводим как результат строку без этих знаков
  public static String cleanStringFromBracketsAndQuotes(String inputString) {
    String outputString = "";
    outputString = inputString.replace("\"", "").replace("{", "").replace("}", "");
    return outputString;
  }
  // Метод для первого задания разбивки строки на элементы массива сначала по запятым, потом по двоеточию 
  // и собирание в строку в виде параметров запроса where
  public static String formingStringWithParameters(String inputString) {
    // Разбиваем строку на элементы по границе запятая с пробелом
    String[] infoParametersWithColons = inputString.split(", ");
    // Задаем stringbuilder куда будем собирать и результирующую строку
    StringBuilder sb = new StringBuilder();
    String resultParameters = "";
    // Разбивает элементы массива также на уже чистые слова без пробелов и знаков препинания
    for (String elementMassive : infoParametersWithColons) {
        if (! elementMassive.contains("null")) {
            String[] infoCleanParameters = elementMassive.split(":");
            // собираем stringbuilder из элементов массива и нужных знаков, шаг делаем 2
            for (int i = 0; i < infoCleanParameters.length - 1; i = i + 2) {
                sb.append(" and ").append(infoCleanParameters[i]).append("='").append(infoCleanParameters[i+1]).append("'");
            }     
        }
    }
    // Удаляем ненужные параметры и переводим в строку
    resultParameters = sb.delete(0, 5).toString();
    return resultParameters;
    
  }
  

}
