package Start;

import Calculator.Calculate;
import Calculator.ComplexNumber;
import Loger.Loger;
import Parser.Parser;

import java.io.IOException;
import java.util.Scanner;

public class ProgramStart implements CalculateStart {
    /**
     * Method of starting and processing values
     */
    public void start() {
        Calculate calculate = new Calculate();
        Parser pars = new Parser();
        Loger log = new Loger();

        boolean flag = true;
        String menu = "---MENU---\n" +                  // Задаем значения МЕНЮ
                "1 -> Сложение\n" +
                "2 -> Вычитание\n" +
                "3 -> Умножение\n" +
                "4 -> Выход";
        Scanner scanner = new Scanner(System.in);
        while (flag){                                   // Запускаем цикл обработки реализации калькулятора
            System.out.println(menu);
            String process = scanner.nextLine();
            ComplexNumber complexNum1;
            ComplexNumber complexNum2;
            switch (process){
                case "1":{                               // Метод сложения комплексных чисел
                    System.out.println("Введите 1-е комплексное число в формате: a+bi");
                    complexNum1 = pars.parser(scanner.nextLine());
                    if(complexNum1 == null){             // Проверка валидности введенных данных
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("Введите 2-е комплексное число в формате: a+bi");
                    complexNum2 = pars.parser(scanner.nextLine());
                    if(complexNum2 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("RESULT\n" + calculate.add(complexNum1, complexNum2));//  Выполнение сложения и вывод результирующего комплексного числа
                    try {
                        log.logger("Сложение", calculate.add(complexNum1, complexNum2)); // Делается логирование операции
                    } catch (IOException e) {
                        e.getMessage();
                    }
                    break;
                }
                case "2":{
                    System.out.println("Введите 1-е комплексное число в формате: a+bi");
                    complexNum1 = pars.parser(scanner.nextLine());
                    if(complexNum1 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("Введите 2-е комплексное число в формате: a+bi");
                    complexNum2 = pars.parser(scanner.nextLine());
                    if(complexNum2 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("RESULT\n" + calculate.subtract(complexNum1, complexNum2));    //  Выполнение вычитания и вывод результирующего комплексного числа
                    try {
                        log.logger("Вычитание", calculate.subtract(complexNum1, complexNum2)); // Делается логирование операции
                    } catch (IOException e) {
                        e.getMessage();
                    }
                    break;
                }
                case "3":{
                    System.out.println("Введите 1-е комплексное число в формате: a+bi");
                    complexNum1 = pars.parser(scanner.nextLine());
                    if(complexNum1 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("Введите 2-е комплексное число в формате: a+bi");
                    complexNum2 = pars.parser(scanner.nextLine());
                    if(complexNum2 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("RESULT\n" + calculate.multiply(complexNum1, complexNum2));    //  Выполнение умножения и вывод результирующего комплексного числа
                    try {
                        log.logger("Умножение", calculate.multiply(complexNum1, complexNum2)); // Делается логирование операции
                    } catch (IOException e) {
                        e.getMessage();
                    }
                    break;
                }
                case "4":{    // выход из цикла
                    flag = false;
                    break;
                }
            }
        }
    }
}
