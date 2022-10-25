package ru.itpark.exerciseLesson4;

public class ExerciseLesson4 {

    public static void Exercise4() {

        System.out.println(fizzBuzz(11, 20));
    }


    public static String fizzBuzz(int begin, int end) {

        String result = "";

        if (begin <= end) {
            for (int i = begin; i <= end; i++) {
                if (i % 15 == 0) System.out.println("FizzBuzz");
                else if (i % 3 == 0) System.out.println("Fizz");
                else if (i % 5 == 0) System.out.println("Buzz");
                else System.out.println(i);
            }
        }
        return result;
    }
}