package ru.itpark.lesson18;

public class Lesson18 {
    public static void Task18(int firstNumber) {

        var i = 1;
        while (i <= firstNumber) {
            System.out.println(firstNumber);
            firstNumber = firstNumber - 1;
        }
        System.out.println("finished!");
    }
}