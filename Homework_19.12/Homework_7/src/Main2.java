import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();
        if((year % 4 == 0 && year%100 != 0) || year % 400 == 0){
            System.out.println("Год высокосный");
        }

        else {
            System.out.println("Не высокосный год");
        }


    }
}
