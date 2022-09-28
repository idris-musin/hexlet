package ru.itpark.lesson4;

public class Lesson4 {
    public static void Task4() {

        var name = "hexlet";

        var letter1 = name.substring(0, 1).toUpperCase();
        var letterLast = name.substring(1).toLowerCase();

        System.out.println(letter1 + letterLast);
    }
}
