package midterm;

import java.util.Scanner;

/*
 * Time Complexity: O(n)
 * 說明：一次建立 prefix sum 陣列，走訪原始陣列 n 次計算累積勝場
 */

public class Q5_CPBLPrefixWins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n], ps = new int[n + 1];
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();
        for (int i = 1; i <= n; i++) ps[i] = ps[i - 1] + a[i - 1];

        int k = sc.nextInt();
        System.out.print("PrefixSum:");
        for (int i = 1; i <= k; i++) System.out.print(" " + ps[i]);

        System.out.println();
        sc.close();
    }
}

