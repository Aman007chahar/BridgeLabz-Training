package string;

import java.util.Scanner;

public class StringOperationsDemo {

    static char[] extractChars(String text) {
        char[] result = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            result[i] = text.charAt(i);
        }
        return result;
    }

    static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

    static void generateNullPointer() {
        String text = null;
        text.length();
    }

    static void handleNullPointer() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException handled");
        }
    }

    static int findLengthWithoutLength(String text) {
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.next();

        char[] manualArray = extractChars(input);
        char[] builtInArray = input.toCharArray();

        boolean arrayCheck = compareCharArrays(manualArray, builtInArray);
        System.out.println("Character arrays equal: " + arrayCheck);

        try {
            generateNullPointer();
        } catch (Exception e) {
            System.out.println("NullPointerException generated");
        }

        handleNullPointer();

        int manualLength = findLengthWithoutLength(input);
        int builtInLength = input.length();

        System.out.println("Length without length(): " + manualLength);
        System.out.println("Length using length(): " + builtInLength);
    }
}
