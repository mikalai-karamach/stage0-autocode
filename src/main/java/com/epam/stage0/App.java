package com.epam.stage0;

public class App {
    public int getMonthNumber(String month) {
        int result = 0;

        switch (month) {
            case "JAN":
                result = 1;
                break;
            case "FEB":
                result = 2;
                break;
            case "MAR":
                result = 3;
                break;
            case "APR":
                result = 4;
                break;
            case "MAY":
                result = 5;
                break;
            case "JUN":
                result = 6;
                break;
            case "JUL":
                result = 7;
                break;
            case "AUG":
                result = 8;
                break;
            case "SEP":
                result = 9;
                break;
            case "OCT":
                result = 10;
                break;
            case "NOV":
                result = 11;
                break;
            case "DEC":
                result = 12;
                break;
        }
        return result;
    }
}

