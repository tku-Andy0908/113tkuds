package finalexam;

import java.util.*;

public class F01_TMRTStopCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] stations = new String[n];
        for (int i = 0; i < n; i++) {
            stations[i] = sc.next();
        }
        String start = sc.next();
        String end = sc.next();
        int idx1 = -1, idx2 = -1;
        for (int i = 0; i < n; i++) {
            if (stations[i].equals(start)) idx1 = i;
            if (stations[i].equals(end)) idx2 = i;
        }
        if (idx1 == -1 || idx2 == -1) {
            System.out.println("Invalid");
        } else {
            System.out.println(Math.abs(idx1 - idx2) + 1);
        }
    }
}

/*
 * Time Complexity: O(n)
 * 說明：一次走訪 n 個站找出起訖站索引，並做常數時間的差值運算。
 */

