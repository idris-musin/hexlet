package ru.itpark.lesson19;

public class Lesson19 {
    public static void Task19() {

        System.out.println(joinNumbersFromRange(1, 1));
        System.out.println(joinNumbersFromRange(2, 3));
        System.out.println(joinNumbersFromRange(5, 10));

    }

    public static String joinNumbersFromRange(int start, int finish) {

        var i = start;
        var result = "";

        while (i <= finish) {
            result = result.concat(String.valueOf(i));
            i = i + 1;
        }

        return result;
    }
}
