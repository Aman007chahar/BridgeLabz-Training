package string;

import java.util.Scanner;

public class CharacterArrayCheck {

    static char[] extractChars(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        char[] customArray = extractChars(text);
        char[] builtInArray = text.toCharArray();

        boolean isSame = compareCharArrays(customArray, builtInArray);

        System.out.println("Result using user-defined method:");
        for (char ch : customArray) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Result using toCharArray():");
        for (char ch : builtInArray) {
            System.out.print(ch + " ");
        }

        System.out.println();
        System.out.println("Are both character arrays equal? " + isSame);
    }
}
