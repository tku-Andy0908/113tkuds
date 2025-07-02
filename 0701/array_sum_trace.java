// Q1：陣列加總過程追蹤

public class array_sum_trace {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("加總過程：total = " + total + " + " + arr[i] + " = " + (total + arr[i]));
            total += arr[i];
        }
        System.out.println("總和為：" + total);

        // 時間複雜度說明：這個演算法會跑一次 for 迴圈，時間複雜度為 O(n)，n 是陣列長度。
    }
}