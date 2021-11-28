package ru.skypro.java.course1.Lesson5;

import java.util.Arrays;
import java.util.Random;

public class HomeWork5 {
    public static void main(String[] args) {

//       Задание 1
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        System.out.println("arr: " + Arrays.toString(arr));
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int value = arr[i];
            sum += value;
        }
        System.out.println(sum);

        // Задание 2
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            int value = arr[1];
            if (value < min) {
                min = value;
            } else if (value > max) {
                max = value;
            }
            System.out.println("Минимальные траты за день: " + min);
            System.out.println("Максимальные траты за день: " + max);
        }
        // Задание 3
        int sum1 = 0;
        for (int value : arr) {
            sum1 += value;
        }
        float averageAmount = sum1 / arr.length;
        System.out.println("Средняя сумма трат в месяц составила " + averageAmount + "рублей");

        // Задание 4
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
        // Задание 5
        int[][] matrix = new int[3][3];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
            matrix[i][matrix.length - 1 - i] = 1;
        }
        for (int[] row : matrix) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
        // Задание 6
        int[] a = {5, 4, 3, 2, 1};
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[a.length - 1 - i];

        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));


    }
}