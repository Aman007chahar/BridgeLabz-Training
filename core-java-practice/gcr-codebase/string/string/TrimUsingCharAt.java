package string;

import java.util.Scanner;

public class TrimUsingCharAt {

    static int[] findTrimBounds(String text) {
        int start = 0;
        int end = 0;
        boolean foundStart = false;

        for (int i = 0; ; i++) {
            if (text.charAt(i) != ' ') {
                start = i;
                break;
            }
        }

        for (int i = start; ; i++) {
            if (text.charAt(i) != ' ') {
                end = i;
                foundStart = true;
            }
        }
    }

    static String buildSubstring(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result = result + text.charAt(i);
        }
        return result;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] bounds = new int[2];
        int left = 0;
        int right = input.length() - 1;

        while (input.charAt(left) == ' ') {
            left++;
        }

        while (input.charAt(right) == ' ') {
            right--;
        }

        bounds[0] = left;
        bounds[1] = right;

        String manualTrim = buildSubstring(input, bounds[0], bounds[1]);
        String builtInTrim = input.trim();

        boolean same = compareStrings(manualTrim, builtInTrim);

        System.out.println("Manual Trim: [" + manualTrim + "]");
        System.out.println("Built-in Trim: [" + builtInTrim + "]");
        System.out.println("Are both same? " + same);
    }
}
