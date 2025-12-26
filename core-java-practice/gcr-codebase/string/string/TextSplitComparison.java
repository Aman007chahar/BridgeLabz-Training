package string;

import java.util.Scanner;

public class TextSplitComparison {

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

    static String[] splitManually(String text) {
        int len = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        int[] spaceIndex = new int[wordCount + 1];
        int idx = 0;
        spaceIndex[idx++] = -1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }

        spaceIndex[idx] = len;

        String[] words = new String[wordCount];

        for (int i = 0; i < wordCount; i++) {
            String temp = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                temp = temp + text.charAt(j);
            }
            words[i] = temp;
        }

        return words;
    }

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        String[] manualSplit = splitManually(inputText);
        String[] builtInSplit = inputText.split(" ");

        boolean result = compareArrays(manualSplit, builtInSplit);

        System.out.println("Manual Split:");
        for (String s : manualSplit) {
            System.out.print(s + " | ");
        }

        System.out.println("\nBuilt-in Split:");
        for (String s : builtInSplit) {
            System.out.print(s + " | ");
        }

        System.out.println("\nAre both results same? " + result);
    }
}

