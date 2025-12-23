package string;

import java.util.Scanner;

public class WordLengthMatrix {

    static int findLength(String text) {
        int count = 0;
        while (true) {
            try {
                text.charAt(count);
                count++;
            } catch (Exception e) {
                break;
            }
        }
        return count;
    }

    static String[] extractWords(String text) {
        int len = findLength(text);
        int wordCount = 0;
        boolean insideWord = false;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !insideWord) {
                wordCount++;
                insideWord = true;
            } else if (ch == ' ') {
                insideWord = false;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String current = "";

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                current = current + ch;
            } else if (current != "") {
                words[index] = current;
                index++;
                current = "";
            }
        }

        if (current != "") {
            words[index] = current;
        }

        return words;
    }

    static String[][] buildWordLengthTable(String[] words) {
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        String[] words = extractWords(input);
        String[][] result = buildWordLengthTable(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + length);
        }
    }
}
