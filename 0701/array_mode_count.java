// Q4：找出陣列中出現次數最多的數字

public class array_mode_count {
    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 1, 1, 1};
        int maxCount = 0;
        int mode = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }
            System.out.println("比對中：" + arr[i] + " 出現次數 = " + count);
            if (count > maxCount) {
                maxCount = count;
                mode = arr[i];
            }
        }

        System.out.println("眾數為：" + mode + "，出現 " + maxCount + " 次");

        // 時間複雜度說明：兩層巢狀迴圈，O(n^2)，可用 HashMap 改成 O(n)（但此題禁止用 Map）。
    }
}
