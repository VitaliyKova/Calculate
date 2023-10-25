package Loger;

import Calculator.ComplexNumber;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

public class Loger {
    public void logger(String str, ComplexNumber res) throws IOException {
        try(FileWriter fileWriter = new FileWriter("Calculate.txt",true)){
            fileWriter.append(new Date() + "\n Выполнена операция -> " + str + "\n" + "RESULT -> " + res + "\n\r");
        }
    }


}
