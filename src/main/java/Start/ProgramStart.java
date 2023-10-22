package Start;

import Calculator.Calculate;
import Calculator.ComplexNumber;

import java.util.Scanner;

public class ProgramStart implements CalculateStart {
    /**
     * Method of starting and processing values
     */
    public void start() {
        Calculate calculate = new Calculate();

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
                    complexNum1 = parser(scanner.nextLine());
                    if(complexNum1 == null){             // Проверка валидности введенных данных
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("Введите 2-е комплексное число в формате: a+bi");
                    complexNum2 = parser(scanner.nextLine());
                    if(complexNum2 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("RESULT\n" + calculate.add(complexNum1, complexNum2));    //  Выполнение сложения и вывод результирующего комплексного числа
                    break;
                }
                case "2":{
                    System.out.println("Введите 1-е комплексное число в формате: a+bi");
                    complexNum1 = parser(scanner.nextLine());
                    if(complexNum1 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("Введите 2-е комплексное число в формате: a+bi");
                    complexNum2 = parser(scanner.nextLine());
                    if(complexNum2 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("RESULT\n" + calculate.subtract(complexNum1, complexNum2));    //  Выполнение вычитания и вывод результирующего комплексного числа
                    break;
                }
                case "3":{
                    System.out.println("Введите 1-е комплексное число в формате: a+bi");
                    complexNum1 = parser(scanner.nextLine());
                    if(complexNum1 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("Введите 2-е комплексное число в формате: a+bi");
                    complexNum2 = parser(scanner.nextLine());
                    if(complexNum2 == null){
                        System.out.println("Попробуйте снова!");
                        System.out.println();
                        break;
                    }
                    System.out.println("RESULT\n" + calculate.multiply(complexNum1, complexNum2));    //  Выполнение умножения и вывод результирующего комплексного числа
                    break;
                }
                case "4":{    // выход из цикла
                    flag = false;
                    break;
                }
            }
        }
    }

    /**
     * Обработка введенных данных из String в Double
     * @param str входные данные типа String
     * @return new complex number
     */
    @Override
    public Calculator.ComplexNumber parser(String str) {
        Calculator.ComplexNumber complexNumber = null;
        try {
            str = str.replace("i", "");
            str = str.replace("I", "");
            if (str.contains("-")) {
                if (str.indexOf("-") == 0 && str.lastIndexOf("-") > 0) {
                    String re = str.substring(str.indexOf('-'), str.lastIndexOf('-'));
                    String im = str.substring(str.lastIndexOf('-'), str.length());
                    complexNumber = new Calculator.ComplexNumber(Double.parseDouble(re), Double.parseDouble(im));
                    return complexNumber;
                } else if (str.indexOf("-") == 0) {
                    String re = str.substring(str.indexOf('-'), str.indexOf('+'));
                    String im = str.substring(str.indexOf('+'), str.length());
                    complexNumber = new Calculator.ComplexNumber(Double.parseDouble(re), Double.parseDouble(im));
                    return complexNumber;
                } else {
                    String re = str.substring(0, str.indexOf('-'));
                    String im = str.substring(str.indexOf('-'), str.length());
                    complexNumber = new Calculator.ComplexNumber(Double.parseDouble(re), Double.parseDouble(im));
                    return complexNumber;
                }
            } else {
                String re = str.substring(0, str.indexOf('+'));
                String im = str.substring(str.indexOf('+'), str.length());
                complexNumber = new Calculator.ComplexNumber(Double.parseDouble(re), Double.parseDouble(im));
                return complexNumber;
            }
        }catch (Exception e){
            System.out.println();
            System.out.println("Введено некорректное значение!");
            System.out.println();

            return complexNumber;
        }
    }
}
