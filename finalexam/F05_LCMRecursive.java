package finalexam;

import java.util.Scanner;

public class F05_LCMRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = findGCD(a, b);
        int lcm = a * b / gcd;
        System.out.println("LCM: " + lcm);
    }

    static int findGCD(int a, int b) {
        if (a == b) return a;
        if (a > b)
            return findGCD(a - b, b);
        else
            return findGCD(a, b - a);
    }
}

/*
 * Time Complexity: O(max(a, b))
 * 說明：輾轉相減法每次減少至少 1，最多減至兩數相等為止，最差需 max(a,b) 次遞迴。
 */
