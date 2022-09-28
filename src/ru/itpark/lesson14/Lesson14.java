package ru.itpark.lesson14;

public class Lesson14 {
    public static void Task14() {

        System.out.println(Lesson14.isPalindrome("шалаш"));
        System.out.println(Lesson14.isPalindrome("ага"));
        System.out.println(Lesson14.isPalindrome("хекслет"));
        System.out.println(Lesson14.isPalindrome("Ага"));
    }

    public static boolean isPalindrome(String text) {

        StringBuilder builder = new StringBuilder(text);

        return text.equalsIgnoreCase(String.valueOf(builder.reverse()));
    }

}