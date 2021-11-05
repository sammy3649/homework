package ru.skypro.java.course1.lesson7;
import java.time.LocalDate;
import java.util.Arrays;

public class HomeWork7 {
    public static void main(String[] args) {
        printIsLeapYear(2021);
        recommendVersion(0, 2021);
        calculateDeliveryDays(70);
        findDouble("aabccddefgghiijjkk");
        int[] data = {3, 2, 1, 6, 5};
        reverseArray(data);
        System.out.println("reversedArray: " + Arrays.toString(data));
    }

    //Задача1
    public static void printIsLeapYear(int year) {
        boolean yearIsLeap = isLeap(year);
        printIsLeapYearResult(year, yearIsLeap);
    }

    private static boolean isLeap(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }


    private static void printIsLeapYearResult(int year, boolean yearIsLeap) {
        if (yearIsLeap) {
            System.out.println(year + " Високосный год");
        } else {
            System.out.println(year + " Не високосный год");
        }
    }

    // Задача 2
    public static void recommendVersion(int clientOS, int deviceYear) {
        boolean deviceIsOld = isDeviseOld(deviceYear);
        StringBuilder messageBuilder = new StringBuilder();
        messageBuilder.append("Установите ");
        if (deviceIsOld) {
            messageBuilder.append("lite ");
        }
        messageBuilder.append("версия для ");
        if (clientOS == 0) {
            messageBuilder.append("IOS ");
        } else {
            messageBuilder.append("Android");

        }
        System.out.println(messageBuilder.toString());
    }

    private static boolean isDeviseOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear < currentYear;

    }

    // Задача 3
    public static void calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней для доставки: 1 сутки");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней для доставки: 2 суток");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней для доставки: 3 суток");
        }
    }

    // Задача 4
    public static void findDouble(String text) {
        char[] letters = text.toCharArray();
        char prevChar = Character.MAX_VALUE;
        for (char letter : letters) {
            if (letter == prevChar) {
                System.out.println("Найден дубль по символу " + letter);
                return;
            }
            prevChar = letter;
        }
        System.out.println(" Дублей не найдено ");
    }

    // Задача 5
    public static void reverseArray(int[] arr) {
        int head = 0;
        int tail = arr.length - 1;
        while (head < tail) {
            int temp = arr[head];
            arr[head++] = arr[tail];
            arr[tail--] = temp;
        }
    }
}
