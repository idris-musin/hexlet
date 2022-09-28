package ru.itpark.lesson2;

public class Lesson2 {
    public static void Task2() {

        var text = "Never forget what you are, for surely the world will not";

        var firstLetter = text.charAt(0);
        var lastText = text.charAt(text.length() - 1);

        System.out.println("First: " + firstLetter + "\n" + "Last: " + lastText);
    }
}
