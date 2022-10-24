package ru.itpark.exerciseLesson3;

public class ExerciseLesson3 {

    public static void Exercise3() {

        System.out.println(isBalanced("(())")); // true
        System.out.println(isBalanced("()()")); // true
        System.out.println(isBalanced("((())")); // false
        System.out.println(isBalanced("")); // true
        System.out.println(isBalanced("))((")); // false
        System.out.println(isBalanced("())()(")); // false
        System.out.println(isBalanced("(f)H()")); // false
    }

    public static boolean isBalanced(String parenthesis) {

        if (parenthesis.length() % 2 != 0 || parenthesis == null || parenthesis.startsWith(")")) return false;
        else {
            char[] ch = parenthesis.toCharArray();
            for (char i :
                    ch) {
                if (!(i == '(' || i == ')')) return false;
            }
        }

        while (parenthesis.contains("()")) {
            parenthesis = parenthesis.replaceAll("\\(\\)", "");
        }
        return (parenthesis.length() == 0);
    }
}