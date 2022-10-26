package ru.itpark.exerciseLesson5;

public class ExerciseLesson5 {
    public static void Exercise5() {

        System.out.println(fib(0)); // 0
        System.out.println(fib(1)); // 1
        System.out.println(fib(3)); // 2
        System.out.println(fib(5)); // 5
        System.out.println(fib(10)); // 55
    }

    public static int fib(int number) {

        int fibonachi0 = 0;
        int fibonachi1 = 1;
        int fibonachi = 0;

        if (number == 1) fibonachi = 1;
        if (number > 1) {
            for (int i = 1; i < number; i++) {

                fibonachi = fibonachi1 + fibonachi0;
                fibonachi0 = fibonachi1;
                fibonachi1 = fibonachi;
            }
        }

        return fibonachi;
    }
}
