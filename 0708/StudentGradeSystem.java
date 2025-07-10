public class StudentGradeSystem {
      public static char getGrade(int score) {
        if (score >= 90) return 'A';
        else if (score >= 80) return 'B';
        else if (score >= 70) return 'C';
        else return 'D';
    }

    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 87, 73, 89, 94, 81, 88};
        char[] grades = new char[scores.length];
        int sum = 0, countA = 0, countB = 0, countC = 0, countD = 0;
        int max = scores[0], min = scores[0];
        int maxIdx = 0, minIdx = 0;

        for (int i = 0; i < scores.length; i++) {
            grades[i] = getGrade(scores[i]);
            sum += scores[i];

            if (scores[i] > max) {
                max = scores[i];
                maxIdx = i;
            }
            if (scores[i] < min) {
                min = scores[i];
                minIdx = i;
            }

            switch (grades[i]) {
                case 'A': countA++; break;
                case 'B': countB++; break;
                case 'C': countC++; break;
                case 'D': countD++; break;
            }
        }

        double avg = (double) sum / scores.length;
        int aboveAvg = 0;
        for (int score : scores) {
            if (score > avg) aboveAvg++;
        }

        // 輸出報告
        System.out.println("======= 成績報告 =======");
        System.out.printf("平均分數: %.2f\n", avg);
        System.out.println("最高分: " + max + " (編號: " + maxIdx + ")");
        System.out.println("最低分: " + min + " (編號: " + minIdx + ")");
        System.out.println("A等級: " + countA + "人");
        System.out.println("B等級: " + countB + "人");
        System.out.println("C等級: " + countC + "人");
        System.out.println("D等級: " + countD + "人");
        System.out.printf("高於平均分比例: %.2f%%\n", 100.0 * aboveAvg / scores.length);
        System.out.println("------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println("學生 " + i + " | 分數: " + scores[i] + " | 等級: " + grades[i]);
        }
    }
}