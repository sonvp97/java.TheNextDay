package com.codegym;

import java.util.Date;

public class TheNextDay {
    public boolean isTheLastDay(int day,int month,int year) {
        if (day == 31 && month == 12) {
            return true;
        } else return false;
    }

    public boolean isTheLastDayOfTheMonth(int day,int month,int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                return true;
            }
        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            if (day == 31) {
                return true;
            } else return false;
        } else if (month == 2) {
            if (isLeapYear( day, month, year) && day == 29){
                return true;
            }
            else {
                if (day == 28){
                    return true;
                }
            }

        }
        return false;
    }
    public boolean isLeapYear(int day,int month,int year){
        if (year%4 == 0 && year%100 != 0 || year%400 == 0){
            return true;
        }
        return false;
    }
    public Date getNextDay (int day,int month,int year){
        if (isTheLastDay( day, month, year)){
            return new Date(year + 1,1,1);
        }
        else if (isTheLastDayOfTheMonth( day, month, year)){
            return new Date(year,month + 1,1);
        }
        else return new Date(year,month,day+1);
    }

//    public static void main(String[] args) {
////        TheNextDay date = new TheNextDay();
////        date.getNextDay(new Date());
//        Date date = new Date(2018,11,31);
//        int a = date.ti();
//        System.out.println(a);
//
//    }
}
