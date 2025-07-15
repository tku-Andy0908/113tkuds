package midterm;

import java.util.Scanner;

/*
 * Time Complexity: O(n)
 * 說明：走訪站名陣列尋找起點與終點，最多 n 次。n 最多為 12。
 */

public class Q1_THSRStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] stations = new String[n];
        for (int i = 0; i < n; i++) stations[i] = sc.next();
        String start = sc.next(), end = sc.next();

        int startIdx = -1, endIdx = -1;
        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) startIdx = i;
            if (stations[i].equals(end)) endIdx = i;
        }

        if (startIdx == -1 || endIdx == -1) System.out.println("Invalid");
        else System.out.println(Math.abs(endIdx - startIdx) + 1);

        sc.close();
    }
}
