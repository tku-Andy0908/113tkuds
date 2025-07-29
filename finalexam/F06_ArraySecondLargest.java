package finalexam;

import java.util.Scanner;

public class F06_ArraySecondLargest {

    static class Pair {
        int max, second;
        Pair(int max, int second) {
            this.max = max;
            this.second = second;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Pair result = findMaxSecond(arr, 0, n - 1);
        System.out.println("SecondMax: " + result.second);
    }

    static Pair findMaxSecond(int[] arr, int left, int right) {
        if (left == right) {
            return new Pair(arr[left], Integer.MIN_VALUE);
        }
        int mid = (left + right) / 2;
        Pair p1 = findMaxSecond(arr, left, mid);
        Pair p2 = findMaxSecond(arr, mid + 1, right);

        int max, second;
        if (p1.max > p2.max) {
            max = p1.max;
            second = Math.max(p1.second, p2.max);
        } else {
            max = p2.max;
            second = Math.max(p2.second, p1.max);
        }
        return new Pair(max, second);
    }
}

/*
 * Time Complexity: O(n)
 * 說明：以遞迴方式劃分陣列進行兩兩合併，總共處理每個元素一次，屬於線性時間。
 */

