package finalexam;

import java.util.*;

public class F04_TieredIncomeTax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] incomes = new int[n];
        int[] taxes = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            incomes[i] = sc.nextInt();
            taxes[i] = calcTax(incomes[i]);
            total += taxes[i];
        }

        for (int tax : taxes) {
            System.out.println("Tax: $" + tax);
        }
        System.out.println("Average: $" + Math.round((double) total / n));
    }

    static int calcTax(int income) {
        int tax = 0;
        int[] bounds = {0, 540000, 1210000, 2420000, 4530000, Integer.MAX_VALUE};
        double[] rates = {0.05, 0.12, 0.20, 0.30, 0.40};
        for (int i = 0; i < rates.length; i++) {
            int lower = bounds[i];
            int upper = bounds[i + 1];
            if (income > lower) {
                tax += Math.min(income, upper) - lower * rates[i];
            } else {
                break;
            }
        }
        return (int) Math.round(tax);
    }
}

/*
 * Time Complexity: O(n)
 * 說明：每筆收入計算稅額為常數時間，總共處理 n 筆輸入，一次走訪完成。
 */

