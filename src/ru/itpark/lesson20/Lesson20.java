package ru.itpark.lesson20;

public class Lesson20 {
    public static void Task20() {

        System.out.println(countChars("HexlEt", 'e'));
        System.out.println(countChars("HexlEt", 'E'));
    }

    public static int countChars(String str, char ch) {

        var i = 0;
        var count = 0;
        while (i < str.length()) {
            if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(ch)) {
                count = count + 1;
            }
            i = i + 1;
        }

        return count;
    }
}
