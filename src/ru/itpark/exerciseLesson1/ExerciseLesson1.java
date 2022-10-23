package ru.itpark.exerciseLesson1;

public class ExerciseLesson1 {
    public static void Exercise1() {

        System.out.println(isPowerOfThree(1)); // true
        System.out.println(isPowerOfThree(3)); // true
        System.out.println(isPowerOfThree(4)); // false
        System.out.println(isPowerOfThree(9)); // true
        System.out.println(isPowerOfThree(6)); // false
        System.out.println(isPowerOfThree(-3)); // false
        System.out.println(isPowerOfThree(0)); // false
    }

    public static boolean isPowerOfThree(int number) {

        if (number <1) return false;
        while (number != 1) {
            if (number % 3 != 0) {
                return false;
            }
            number = number / 3;
        }

        return true;
    }
}
