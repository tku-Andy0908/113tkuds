public class ArraySearcher {
  public static int findElement(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) return i;
        }
        return -1;
    }

    public static int countOccurrences(int[] array, int target) {
        int count = 0;
        for (int num : array) {
            if (num == target) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] data = {12, 45, 23, 67, 34, 89, 56, 78, 91, 25};

        int index67 = findElement(data, 67);
        int index100 = findElement(data, 100);

        System.out.println("搜尋 67: " + index67);
        System.out.println("搜尋 100: " + index100);

        System.out.println("67 出現次數: " + countOccurrences(data, 67));
        System.out.println("100 出現次數: " + countOccurrences(data, 100));
    }
}
