package midterm;

import java.util.Scanner;

public class Q7_DailyPowerReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String line = sc.nextLine().trim();  // ← 加上 trim() 防止尾端換行空格干擾
        String[] parts = line.split("\\s+"); // ← 保險地切空白（空格、tab 都能切）

        int[] power = new int[7];
        for (int i = 0; i < 7; i++) {
            power[i] = Integer.parseInt(parts[i]);
        }

        int l = 0, r = 6;
        while (l < r) {
            int tmp = power[l];
            power[l] = power[r];
            power[r] = tmp;
            l++;
            r--;
        }

        for (int i = 0; i < 7; i++) {
            System.out.print(power[i]);
            if (i < 6) System.out.print(" ");
        }
        System.out.println();

        sc.close();
    }
}
