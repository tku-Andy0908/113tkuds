public class ArrayAcces {
   
        public static void main(String[] args) {
            int[] scores = {85, 92, 77, 60, 88};
    
            // 讀取陣列中一個數字代表元素
            int firstScore = scores[0];    // 取得第一個成績: 85
            int lastScore = scores[4];     // 取得最後一個成績: 88
            int middleScore = scores[2];   // 取得中間成績: 77
    
            System.out.println("第一個成績為: " + firstScore);
            System.out.println("最後一個成績為: " + lastScore);
            System.out.println("中間位置為: " + middleScore);
    
            // 修改陣列 – 直接更新指定位置的值
            scores[0] = 90;                // 將第一個成績改為 90
            scores[scores.length - 1] = 95; // 將最後一個成績改為 95
    
            // 取得陣列的長度
            int arrayLength = scores.length;  // 陣列長度: 5
    
            System.out.println("\n輸出修改後的陣列:");
            for (int i = 0; i < arrayLength; i++) {
                System.out.printf("第 %d 筆: %d%n", i, scores[i]);
            }
        }
    }
    