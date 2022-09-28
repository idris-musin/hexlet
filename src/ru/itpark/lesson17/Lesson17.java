package ru.itpark.lesson17;

public class Lesson17 {
    public static void Task17() {

        var name = "heXlet";

        var letter1 = name.substring(0, 1).toUpperCase();
        var letterLast = name.substring(1).toLowerCase();

        System.out.println(letter1 + letterLast);
    }
}
