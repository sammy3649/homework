package ru.skypro.java.course1.lessonFinal;

import java.util.Random;

public class FinalWork<printName> {
    private static final Employee[] employees = new Employee[10];
    public static void main(String[] args) {
        Random random = new Random();
        addEmployee(new Employee("Ivanov Ivan Ivanivich", 1, random.nextInt(100_000) + 100_000));
        addEmployee(new Employee("Ivanov Ivan Sergeevich", 2, random.nextInt(100_000) + 100_000));
        addEmployee(new Employee("Ivanov Ivan Mihailovich", 3, random.nextInt(100_000) + 100_000));
        addEmployee(new Employee("Ivanov Ivan Genadevich", 4, random.nextInt(100_000) + 100_000));
        addEmployee(new Employee("Ivanov Ivan Dmitrievich", 5, random.nextInt(100_000) + 100_000));
        System.out.println(new Employee("Ivanov Ivan Ivanivich", 1, random.nextInt(100_000) + 100_000));
        System.out.println(new Employee("Ivanov Ivan Sergeevich", 2, random.nextInt(100_000) + 100_000));
        System.out.println(new Employee("Ivanov Ivan Mihailovich", 3, random.nextInt(100_000) + 100_000));
        System.out.println(new Employee("Ivanov Ivan Genadevich", 4, random.nextInt(100_000) + 100_000));
        System.out.println(new Employee("Ivanov Ivan Dmitrievich", 5, random.nextInt(100_000) + 100_000));
    }

    private static double calculateSum() {
        double sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static double getAverageSum() {
        return calculateSum() / employees.length;
    }

    public static double getMaxSum() {
        double max = Double.MIN_VALUE;
        for (Employee employee : employees) {
            int value = employee.getSalary();
            if (value > max) {
                max = value;
            }
        }
        return getMaxSum();
    }

    public static double getMinSum() {
        double min = Double.MAX_VALUE;
        for (Employee employee : employees) {
            int value = employee.getSalary();
            if (value < min) {
                min = value;
            }
        }
        return getMinSum();
    }

    public static boolean addEmployee(Employee newEmployee) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = newEmployee;
                return true;
            }

        }
        return false;
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
