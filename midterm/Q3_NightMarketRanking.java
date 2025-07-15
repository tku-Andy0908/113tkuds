package midterm;

import java.util.Scanner;

/*
 * Time Complexity: O(n^2)
 * 說明：選擇排序需進行 n 次找最大，每次需與剩餘項目比較，總共約 n(n-1)/2 次比較
 */

public class Q3_NightMarketRanking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] scores = new double[n];
        for (int i = 0; i < n; i++) scores[i] = sc.nextDouble();

        for (int i = 0; i < n; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (scores[j] > scores[maxIdx]) maxIdx = j;
            }
            double tmp = scores[i];
            scores[i] = scores[maxIdx];
            scores[maxIdx] = tmp;
        }

        for (int i = 0; i < Math.min(5, n); i++) {
            System.out.printf("%.1f\n", scores[i]);
        }

        sc.close();
    }
}
