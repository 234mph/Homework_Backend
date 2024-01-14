package org.example;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[8];
        Random random = new Random();

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) + 1;
        }
        System.out.println("Исходный массив: " + Arrays.toString(numbers));
        for (int i = 1; i < numbers.length; i += 2) {
            numbers[i] = 0;
        }
        System.out.println("Массив после замены: " + Arrays.toString(numbers));
    }
}