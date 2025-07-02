// Q5：有序陣列的二元搜尋比對過程

import java.util.Scanner;

public class binary_search_trace {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入要搜尋的數字：");
        int target = sc.nextInt();

        int left = 0, right = arr.length - 1;
        boolean found = false;

        while (left <= right) {
            int mid = (left + right) / 2;
            System.out.println("搜尋範圍：left = " + left + ", right = " + right + ", mid = " + mid + " → arr[mid] = " + arr[mid]);

            if (arr[mid] == target) {
                found = true;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (found) {
            System.out.println("結果：已找到！");
        } else {
            System.out.println("結果：找不到。");
        }

        // 時間複雜度說明：每次搜尋都把範圍砍半，時間複雜度為 O(log n)。
    }
}
