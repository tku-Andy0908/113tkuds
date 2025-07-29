package finalexam;

import java.util.Scanner;

public class F07_AnagramPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();
        int[] freq = new int[26];

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                freq[c - 'a']++;
            }
        }

        int oddCount = 0;
        for (int count : freq) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        if (oddCount <= 1) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
