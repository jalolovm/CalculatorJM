package com.company;


public class Main {

    public static void main(String[] args) {

        try {
            Operation operation = new Operation();
            try {
                operation.arabic();
                operation.roman();
                operation.eitherOr1();
                operation.confines();
                operation.calculation();
            } catch (IncorrectException e) {
                System.out.println("Некорректный ввод данных");
            }
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Некорректный ввод данных, расставьте пробелы");
        }
    }
}