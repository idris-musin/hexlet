package ru.itpark.lesson16;

public class Lesson16 {
    public static void Task16(){

        System.out.println(convertString("Hello"));
        System.out.println(convertString("hello"));
        System.out.println(convertString(""));
    }

    public static String convertString(String text) {

        StringBuilder builder = new StringBuilder(text);

        if (text.isEmpty()) {
            return "";
        } else if (Character.isUpperCase(builder.charAt(0))) {
            return String.valueOf(builder);
        } else return String.valueOf(builder.reverse());
    }
}