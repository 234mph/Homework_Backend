import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int i;
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        i = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        int x = num(i, a, b);
        System.out.println(x);
    }
    private static int num(int i, int a, int b){
        if (i >= a && i >= b){
            return  i;
        }
        else if (b >= i && b >= a) {
            return b;
        }
        else {
            return a;
        }
    }
}
