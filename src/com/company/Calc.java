package com.company;

public class Calc {
    int result;
    public int doIt(char sign, int first, int second) throws IncorrectException {
        switch (sign){
            case ('+'):
                result = first+second;
                break;
            case ('-'):
                result = first-second;
                break;
            case ('*'):
                result = first*second;
                break;
            case ('/'):
                result = first/second;
                break;
            default:
                throw new IncorrectException();
        }
        return result;
    }
}
