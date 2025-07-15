package midterm;

import java.util.Scanner;

/*
 * Time Complexity: O(log n)
 * 說明：使用二分搜尋找大於查詢時間的第一個車次，搜尋範圍為已排序的 n 個時間
 */

public class Q2_NextTHSRDeparture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            String[] t = sc.next().split(":");
            times[i] = Integer.parseInt(t[0]) * 60 + Integer.parseInt(t[1]);
        }

        String[] q = sc.next().split(":");
        int query = Integer.parseInt(q[0]) * 60 + Integer.parseInt(q[1]);

        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (times[mid] > query) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        if (ans == n) System.out.println("No train");
        else {
            int t = times[ans];
            System.out.printf("%02d:%02d\n", t / 60, t % 60);
        }

        sc.close();
    }
}

