package ru.itpark.exerciseLesson6;

public class ExerciseLesson6 {
    public static void Exercise6() {

        System.out.println(diff(0, 45));
        System.out.println(diff(0, 180));
        System.out.println(diff(0, 190));
        System.out.println(diff(120, 280));
    }

    public static int diff(int angle1, int angle2) {

        int result;
        result = angle2 - angle1;

        if (result > 180) {
            result = 360 - angle2;
        }

        return result;
    }
}
