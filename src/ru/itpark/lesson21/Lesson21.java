package ru.itpark.lesson21;

public class Lesson21 {
    public static void Task21() {

        System.out.println(encrypt("move"));
        System.out.println(encrypt("attack"));
        System.out.println(encrypt("going"));

    }

    public static String encrypt(String str) {
        var result = "";

        if (str.length() % 2 == 0) {
            for (int i = 0; i < str.length(); i = i + 2) {
                var nextSymbol = str.substring(i + 1, i + 2);
                result = result.concat(nextSymbol) + str.charAt(i);
            }
        } else {
            var lastSymbol = str.charAt(str.length() - 1);
            for (int i = 0; i < str.length() - 1; i = i + 2) {
                var nextSymbol = str.substring(i + 1, i + 2);
                result = result.concat(nextSymbol) + str.charAt(i);
            }
            result = result + lastSymbol;
        }
        return result;
    }
}
