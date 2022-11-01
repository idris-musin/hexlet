package ru.itpark.exerciseLesson7;

public class ExerciseLesson7 {
    public static void Exercise7() {

        System.out.println(dnaToRna("ACGTGGTCTTAA")); // "UGCACCAGAAUU"
        System.out.println(dnaToRna("CCGTA")); // "GGCAU"
        System.out.println(dnaToRna("")); // ""
        System.out.println(dnaToRna("ACNTG")); // null
    }

    public static String dnaToRna(String dnaChain) {

        char[] ch = dnaChain.toCharArray();

        for (int i = 0; i < ch.length; i++) {

            if (ch[i] == 'G') ch[i] = 'C';
            else if (ch[i] == 'C') ch[i] = 'G';
            else if (ch[i] == 'T') ch[i] = 'A';
            else if (ch[i] == 'A') ch[i] = 'U';
            else if (ch[i] == '0') ch[i] = '*';
            else ch[i] = '+';
        }

        dnaChain = String.valueOf(ch);

        if (dnaChain.contains("*")) dnaChain = "P";
        if (dnaChain.contains("+")) dnaChain = null;

        return dnaChain;
    }
}
