package com.company;

import java.util.Scanner;

public class Operation {

    private Scanner scan = new Scanner(System.in);
    private String primer = scan.nextLine();
    private String[] element = primer.split("[ ]");
    private String oper = element[1];
    private char sign = oper.charAt(0);
    private int[] value = new int[2];
    private int[] arab = new int[2];

    private ArabRome ar = new ArabRome();
    private String r1 = element[0], r2 = element[2];
    private int[] rome = new int[2];

    Calc calc = new Calc();


    public int[] arabic() {
        try {
            arab[0] = Integer.parseInt(element[0]);
            arab[1] = Integer.parseInt(element[2]);
        } catch (NumberFormatException eх) {
            arab[0] = 0;
            arab[1] = 0;
        } finally {
            return arab;
        }
    }

    public int[] roman() {
        rome[0] = ar.toArabic(r1, rome[0]);
        rome[1] = ar.toArabic(r2, rome[1]);
        return rome;
    }

    public void eitherOr1() {
        boolean flag = arab[0] < rome[0];

        if (flag == false) {
            value[0] = arab[0];
            value[1] = arab[1];

        } else if (flag) {
            value[0] = rome[0];
            value[1] = rome[1];
        }

    }

    public void calculation() throws IncorrectException {
        boolean flaq = arab[0] < rome[0];

        if (flaq == false){

            calc.doIt(sign, value[0], value[1]);
            System.out.println(calc.result);

        } else if (flaq) {

            try {
                RomeArab converter = new RomeArab();
                converter.setA(calc.doIt(sign, value[0], value[1]));
                converter.foo();
            } catch (IndexOutOfBoundsException minus) {
                System.out.println("Римские выражения не могут быть отрицательными, воспользуйтесь " +
                        "арабскими числами");
            }
        }
    }

    public void confines() throws IncorrectException {

        if (value[0] < 1 | value[0] > 10 | value[1] < 1 | value[1] > 10 | oper.length() > 1| element.length>3) {
            throw new IncorrectException();
        }
    }
}