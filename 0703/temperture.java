import java.util.Scanner;

public class temperture {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);


        double c = sc.nextDouble();
        double F = (c * 9/5) + 32;
        System.out.println(F);
        sc.close();
}
}
