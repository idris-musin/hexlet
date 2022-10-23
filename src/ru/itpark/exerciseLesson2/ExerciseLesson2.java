package ru.itpark.exerciseLesson2;

public class ExerciseLesson2 {
    public static void Exercise2() {

        System.out.println(addDigits(0));
        System.out.println(addDigits(1));
        System.out.println(addDigits(9));
        System.out.println(addDigits(10));
        System.out.println(addDigits(38));
        System.out.println(addDigits(-2));
    }

    public static String addDigits(int number) {

        int sum = 0;
        int result = 0;
        String stringNumber = String.valueOf(number);

        if (number >= 0) {
            for (int i = 0; i < stringNumber.length(); i++) {
                int numeral = number % 10;
                number = number / 10;
                sum = sum + numeral;
            }

            if (sum % 10 != 0) {
                String stringSum = String.valueOf(sum);
                for (int j = 0; j < stringSum.length(); j++) {
                    int numeralSum = sum % 10;
                    sum = sum / 10;
                    result = result + numeralSum;
                }
            } else result = sum;
        } else return "Number < 0";

        return String.valueOf(result);
    }
}
