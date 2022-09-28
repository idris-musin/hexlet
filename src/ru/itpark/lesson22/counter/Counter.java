package ru.itpark.lesson22.counter;

public class Counter {
    public static int bigLettersCount(String str) {
        var quantityBigSymbol = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                quantityBigSymbol = quantityBigSymbol + 1;
            }
        }
        return quantityBigSymbol;
    }
}
