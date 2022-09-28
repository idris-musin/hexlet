package ru.itpark.lesson22;

import ru.itpark.lesson22.counter.Counter;

public class Lesson22 {
    public static void Task22() {

        System.out.println(Counter.bigLettersCount("AsDfGG"));
        System.out.println(Counter.bigLettersCount("asdJkl"));

        System.out.println(greaterThan("QwQ", "aa"));
        System.out.println(greaterThan("QwQbki", "AHK"));
        System.out.println(greaterThan("A", "B"));
    }

    public static boolean greaterThan(String str1, String str2) {

        boolean result = false;
        var quantityBigSymbol1 = 0;
        var quantityBigSymbol2 = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (Character.isUpperCase(str1.charAt(i))) {
                quantityBigSymbol1 = quantityBigSymbol1 + 1;
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (Character.isUpperCase(str2.charAt(i))) {
                quantityBigSymbol2 = quantityBigSymbol2 + 1;
            }
        }

        if (quantityBigSymbol1 > quantityBigSymbol2) {
            result = true;
        }

        return result;
    }
}
