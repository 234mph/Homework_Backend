import java.util.Scanner;

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input amount");
        int userInput = sc.nextInt();
//        int sum = getSum(userInput);
//
//        System.out.println(sum);
        System.out.println("количество дней " + getDays(userInput));

    }
    public static int getSum (int sum) {
        if(sum!=1) {
            for (int delitel = sum - 1; delitel >= 1; delitel--) {
                if(sum%delitel==0) {
                    return delitel;
                }
            }
        }
        return 1;

    }
    public static int getDays(int sum) {
        int countDays = 0;
        int divider;
        while (sum>=1) {
            countDays++;
            divider = getSum(sum);
            sum-=divider;
            System.out.println(" день " + countDays + ". пользователь снял:  " + divider + "  " +
                    "баланс: " + sum);
        }
        return countDays;
    }
}