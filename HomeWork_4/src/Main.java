import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double m;
        double n;
        Scanner sc = new Scanner(System.in);
        m = sc.nextDouble();
        n = sc.nextDouble();
        if (Math.abs(10 - m) > Math.abs(10 - n)) {
            System.out.println(n);
        } else if (Math.abs(10 - m) < Math.abs(10 - n)) {
            System.out.println(m);


        }
        else if (Math.abs(10 - m) == Math.abs(10 - n)) {
            System.out.println(n);
        }
    }
}