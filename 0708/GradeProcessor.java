public class GradeProcessor {
     public static void main(String[] args) {
        int[] grades = {78, 85, 92, 67, 88, 95, 73, 90};
        int sum = 0;
        int max = grades[0], min = grades[0];
        int maxIndex = 0, minIndex = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
            if (grades[i] > max) {
                max = grades[i];
                maxIndex = i;
            }
            if (grades[i] < min) {
                min = grades[i];
                minIndex = i;
            }
        }

        double avg = (double) sum / grades.length;
        int countAboveAvg = 0;

        for (int g : grades) {
            if (g > avg) countAboveAvg++;
        }

        System.out.printf("總分: %d\n平均: %.2f\n", sum, avg);
        System.out.println("最高分: " + max + "，索引: " + maxIndex);
        System.out.println("最低分: " + min + "，索引: " + minIndex);
        System.out.println("成績高於平均的人數: " + countAboveAvg);

        for (int i = 0; i < grades.length; i++) {
            System.out.println("學生 " + i + ": " + grades[i]);
        }
    }
}

