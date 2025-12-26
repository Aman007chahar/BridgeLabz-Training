package string;

import java.util.Scanner;

public class VowelConsonantCounter {

    static String classifyChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "NotLetter";
    }

    static int[] countVowelsConsonants(String text) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; ; i++) {
            try {
                char ch = text.charAt(i);
                String result = classifyChar(ch);

                if (result.equals("Vowel")) {
                    vowelCount++;
                } else if (result.equals("Consonant")) {
                    consonantCount++;
                }
            } catch (Exception e) {
                break;
            }
        }

        return new int[]{vowelCount, consonantCount};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        int[] result = countVowelsConsonants(inputText);

        System.out.println("Vowels = " + result[0]);
        System.out.println("Consonants = " + result[1]);
    }
}
