// Q2：線性搜尋比對追蹤

import java.util.Scanner;

public class linear_search_trace {
    public static void main(String[] args) {
        int[] s = {1, 3, 5, 7, 9};
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入要搜尋的數字：");
        int target = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < s.length; i++) {
            System.out.println("比對中：" + target + " vs " + s[i]);
            if (s[i] == target) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("結果：找到");
        } else {
            System.out.println("結果：沒找到");
        }

        // 時間複雜度說明：線性搜尋最差情況要比對全部元素，時間複雜度為 O(n)。
    }
}
