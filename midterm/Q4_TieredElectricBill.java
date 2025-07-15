package midterm;

import java.util.Scanner;

/*
 * Time Complexity: O(n)
 * 說明：每筆用電獨立處理，總共處理 n 筆資料，每筆耗時固定
 */

public class Q4_TieredElectricBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] bills = new int[n];
        int total = 0;

        for (int i = 0; i < n; i++) {
            int kWh = sc.nextInt();
            int bill = calc(kWh);
            bills[i] = bill;
            total += bill;
        }

        for (int bill : bills) System.out.println("Bill: $" + bill);

        int avg = Math.round((float) total / n);
        System.out.println("Total: $" + total);
        System.out.println("Average: $" + avg);

        sc.close();
    }

    static int calc(int kWh) {
        double cost = 0;
        int[] limits = {120, 210, 170, 200, 300, Integer.MAX_VALUE};
        double[] rates = {1.68, 2.45, 3.70, 5.04, 6.24, 8.46};

        for (int i = 0; i < limits.length; i++) {
            int used = Math.min(kWh, limits[i]);
            cost += used * rates[i];
            kWh -= used;
            if (kWh == 0) break;
        }

        return (int) Math.round(cost);
    }
}

