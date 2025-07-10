public class arraydemo {
    public static void main(String[] args) {
        double[] numbers ={1.1,2.3,3,4,5};
        for (int i=0; i<numbers.length;i++){
            System.out.println(numbers[i]);
            System.out.println("Index:"+i);
            System.out.println("占用位元組"+Double.BYTES+"bytes");
        }

    }
}
