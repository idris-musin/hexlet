package ru.itpark.lesson13;

public class Lesson13 {
    public static void Task13() {

        System.out.println(Lesson13.getHiddenCard("2034399002121100", 1));
        System.out.println(Lesson13.getHiddenCard("1234567812345678", 2));
        System.out.println(Lesson13.getHiddenCard("1234567812345678", 3));
        System.out.println(Lesson13.getHiddenCard("1234567812345678"));
    }

    public static String getHiddenCard(String card, int number) {
        return "*".repeat(number) + card.substring(12);
    }

    public static String getHiddenCard(String card) {
        return "****" + card.substring(12);
    }
}
