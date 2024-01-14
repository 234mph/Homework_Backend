import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isEdekaOpen;
        boolean isReweOpen;
        boolean canBuy;
        Scanner sc = new Scanner(System.in);
        isEdekaOpen = sc.nextBoolean();
        isReweOpen = sc.nextBoolean();
        canBuy = method(isEdekaOpen, isReweOpen);
        System.out.println("Я могу купить еду, это " + canBuy);


    }
    private static boolean method (boolean isEdekaOpen, boolean isReweOpen) {
        if (isEdekaOpen == true || isReweOpen == true) {
            return true;
        } else if (isEdekaOpen == false && isReweOpen == false) {
            return false;
        }
        return isEdekaOpen;
    }
}