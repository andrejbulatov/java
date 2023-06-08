import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Решение задачи 1
        System.out.println("Task 1");
        Scanner iScanner = new Scanner(System.in);
        
        System.out.println("Input number N: ");
        int number = iScanner.nextInt();

        int summaryNumbers = sumNumbers(number);
        System.out.printf("Sum nubers from 1 to %d equals %d", number, summaryNumbers);

        // Решение задачи 2
        System.out.println();
        System.out.println("Task 2");
        for (int i = 1; i < 1000; i++) {
            boolean flag = simpleCheck(i);
            String result = "";
            if (flag) {
                result = i + " ";
            }
            System.out.print(result);
        }

        // Решение задачи 3
        System.out.println();
        System.out.println("Task 3");

        System.out.println("Input number one: ");
        double numberFirst = iScanner.nextDouble();
        System.out.println("Input number two: ");
        double numberSecond = iScanner.nextDouble();
        System.out.println("Input sign: ");
        String sign = iScanner.next();
        
        double result = 0;

        switch (sign) {
            case "+" :
                result = numberFirst + numberSecond;
                break;
            case "-" :
                result = numberFirst - numberSecond;
                break;
            case "*" :
                result = numberFirst * numberSecond;
                break;
            case "/" :
                result = numberFirst / numberSecond;
                break;
        }

        System.out.printf("%.2f %s %.2f = %.2f", numberFirst, sign, numberSecond, result);

    }

       //  Метод для задачи 1
    public static int sumNumbers(int inputNumber) {
        int sum = 0;
        for (int i = 1; i < inputNumber; i++) {
            sum += i;
        }
        return sum;
    }

       //  Метод для задачи 2
    public static boolean simpleCheck(int number) {
        boolean res = true;
        for (int i = 2; i < 1000; i++) {
            if (number >= i && number % i == 0)
                if (i != number) {
                    res = false;
                    break;
                }              
        }
        return res;
    }



}
