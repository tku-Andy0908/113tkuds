public class digitSum {
    public static int digitSum(int n) {
        if (n == 0) return 0;
        return n % 10 + digitSum(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(digitSum(12345)); // 輸出：15
    }
}
