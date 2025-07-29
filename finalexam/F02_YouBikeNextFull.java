package finalexam;

import java.util.*;

public class F02_YouBikeNextFull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] times = new int[n];
        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(":");
            times[i] = Integer.parseInt(parts[0]) * 60 + Integer.parseInt(parts[1]);
        }
        String[] query = sc.nextLine().split(":");
        int qMin = Integer.parseInt(query[0]) * 60 + Integer.parseInt(query[1]);

        int left = 0, right = n;
        while (left < right) {
            int mid = (left + right) / 2;
            if (times[mid] > qMin) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        if (left == n) {
            System.out.println("No bike");
        } else {
            int h = times[left] / 60;
            int m = times[left] % 60;
            System.out.printf("%02d:%02d\n", h, m);
        }
    }
}

/*
 * Time Complexity: O(log n)
 * 說明：使用二分搜尋找出大於查詢時間的最早時間，操作在已排序陣列上。
 */

