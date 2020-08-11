package com.company;

public class ArabRome {

    public int toArabic(String a, int b) {
        switch (a) {
            case ("I"):
                b = 1;
                break;
            case ("II"):
                b = 2;
                break;
            case ("III"):
                b = 3;
                break;
            case ("IV"):
                b = 4;
                break;
            case ("V"):
                b = 5;
                break;
            case ("VI"):
                b = 6;
                break;
            case ("VII"):
                b = 7;
                break;
            case ("VIII"):
                b = 8;
                break;
            case ("IX"):
                b = 9;
                break;
            case ("X"):
                b = 10;
                break;
            default:
        }
        return b;
    }

}
