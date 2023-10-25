package Parser;

import Calculator.ComplexNumber;

public class Parser implements Parsered{
    /**
     * Обработка введенных данных из String в Double
     * @param str входные данные типа String
     * @return new complex number
     */
    @Override
    public ComplexNumber parser(String str) {
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
