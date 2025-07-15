package midterm;

import java.util.Scanner;

public class Q9_FindFiveStarStalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] score = new int[n];
        for (int i = 0; i < n; i++) score[i] = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (score[i] == 5) {
                if (found) System.out.print(" ");
                System.out.print(i);
                found = true;
            }
        }

        if (!found) System.out.println("None");
        else System.out.println();

        sc.close();
    }
}
