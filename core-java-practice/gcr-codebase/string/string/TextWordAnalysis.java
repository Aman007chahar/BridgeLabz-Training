package string;

import java.util.Scanner;

public class TextWordAnalysis {

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

    static String[] splitWords(String text) {
        int len = findLength(text);
        int wordCount = 0;
        boolean inWord = false;

        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch != ' ' && !inWord) {
                wordCount++;
                inWord = true;
            } else if (ch == ' ') {
                inWord = false;
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
                words[index++] = current;
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

    static int[] findShortestAndLongest(String[][] table) {
        int min = Integer.parseInt(table[0][1]);
        int max = min;
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) {
                min = len;
                minIndex = i;
            }
            if (len > max) {
                max = len;
                maxIndex = i;
            }
        }

        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String[] words = splitWords(text);
        String[][] table = buildWordLengthTable(words);
        int[] result = findShortestAndLongest(table);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        System.out.println("Shortest Word: " + table[result[0]][0]);
        System.out.println("Longest Word: " + table[result[1]][0]);
    }
}
