package ru.itpark.lesson12;

public class Lesson12 {
    public static void Task12(){

        System.out.println(truncate("It works!", 4));
    }

    public static String truncate(String text, int length) {

        return text.replace(text, text.substring(0, length)) + "...";
    }
}
