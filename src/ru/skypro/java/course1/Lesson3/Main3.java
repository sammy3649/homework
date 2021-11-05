package ru.skypro.java.course1.Lesson3;

public class Main3 {
    public static void main(String[] args) {
        // Задача 1
        int clientOs = 1;
        if (clientOs == 0) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }


        // Задача 2
        int clientDeviceYear = 2016;
        int clientOs1 = 0;

        boolean isLiteNeeded = clientDeviceYear < 2015;
        boolean isIos = clientOs1 == 0;
        boolean isAndroid = clientOs1 == 1;

        if (isIos) {
            if (isLiteNeeded) {
                System.out.println("Установите облегченную версию для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else if (isAndroid)
            if (isLiteNeeded) {
                System.out.println("Установите облегченную версию для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        // Задача 3
        int year = 2020;
        if (year % 4 == 0 || year % 400 == 0) {
            System.out.println(year + " - Високосный год");
        } else if (year % 100 != 0) {
            System.out.println(year + " - Не високосный год");
        }


        // Задача 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней для доставки: 1 сутки");
        } else if (deliveryDistance <= 60) {
            System.out.println("Потребуется дней для доставки: 2 суток");
        } else if (deliveryDistance <= 100) {
            System.out.println("Потребуется дней для доставки: 3 суток");
        }


        // Задача 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 12, 1, 2:
                System.out.println("Зима");
                break;

            case 3, 4, 5:
                System.out.println("Весна");
                break;

            case 6, 7, 8:
                System.out.println("Лето");
                break;

            case 9, 10, 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует =) Даже в календаре племени Майя");
        }

        }
    }


