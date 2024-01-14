package org.example;
import java.util.Arrays;
import java.util.Random;

public class ArrayCheck {
    public static void main(String[] args) {
        int[] num = new int[5];
        Random random = new Random();
        for (int i = 0; i < num.length; i++) {
            num[i] = random.nextInt(90) + 10;
        }
        System.out.println("Исходный массив: " + Arrays.toString(num));
        boolean isIncreasing = true;
        for (int i = 1; i < num.length; i++) {
            if (num[i] <= num[i - 1]) {
                isIncreasing = false;
                break;
            }
        }
        if (isIncreasing) {
            System.out.println("Массив является строго возрастающей последовательностью.");
        } else {
            System.out.println("Массив не является строго возрастающей последовательностью.");
        }
    }
}
