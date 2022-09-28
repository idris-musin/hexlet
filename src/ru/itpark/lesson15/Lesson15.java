package ru.itpark.lesson15;

public class Lesson15 {
    public static void Task15() {

        System.out.println(Lesson15.isLeapYear(2018));
        System.out.println(Lesson15.isLeapYear(2017));
        System.out.println(Lesson15.isLeapYear(2016));
    }

    public static boolean isLeapYear(int year) {

        return (year % 400 ==0) || ((year % 4 == 0) && (year % 100 != 0));
    }
}
