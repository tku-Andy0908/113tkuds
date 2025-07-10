public class ArrayStatistics {
     public static void main(String[] args) {
        int[] arr = {5, 12, 8, 15, 7, 23, 18, 9, 14, 6};

        int sum = 0, max = arr[0], min = arr[0];
        int maxIdx = 0, minIdx = 0;
        int even = 0, odd = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
            if (arr[i] < min) {
                min = arr[i];
                minIdx = i;
            }
            if (arr[i] % 2 == 0) even++;
            else odd++;
        }

        double avg = (double) sum / arr.length;
        int countAboveAvg = 0;
        for (int num : arr) {
            if (num > avg) countAboveAvg++;
        }

        System.out.println("========== 陣列統計結果 ==========");
        System.out.println("總和: " + sum);
        System.out.printf("平均值: %.2f\n", avg);
        System.out.println("最大值: " + max + " (索引: " + maxIdx + ")");
        System.out.println("最小值: " + min + " (索引: " + minIdx + ")");
        System.out.println("大於平均的數字個數: " + countAboveAvg);
        System.out.println("偶數個數: " + even);
        System.out.println("奇數個數: " + odd);
    }
}
