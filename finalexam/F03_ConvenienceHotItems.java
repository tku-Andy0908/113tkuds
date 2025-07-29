package finalexam;

import java.util.*;

public class F03_ConvenienceHotItems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] names = new String[n];
        int[] qtys = new int[n];

        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            qtys[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            String keyName = names[i];
            int keyQty = qtys[i];
            int j = i - 1;
            while (j >= 0 && qtys[j] < keyQty) {
                names[j + 1] = names[j];
                qtys[j + 1] = qtys[j];
                j--;
            }
            names[j + 1] = keyName;
            qtys[j + 1] = keyQty;
        }

        for (int i = 0; i < Math.min(10, n); i++) {
            System.out.println(names[i] + " " + qtys[i]);
        }
    }
}

/*
 * Time Complexity: O(n^2)
 * 說明：使用插入排序對銷量進行排序，最壞情況需比較與移動 n² 次。
 */

