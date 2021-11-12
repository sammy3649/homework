package ru.skypro.java.course1.lessonFinal;

import java.util.Random;

import static ru.skypro.java.course1.lessonFinal.Employee.addEmployee;
import static ru.skypro.java.course1.lessonFinal.Employee.getId;

public class FinalWork {

    private static Employee[] employees = new Employee[10];
    private static int sum;

    public static void main(String[] args) {
        Random random = new Random();
        Employee[] employees = new Employee[10];
        addEmployee(employees, new Employee("Ivanov Ivan Ivanivich", 1, random.nextInt(100_000) + 100_000));
        addEmployee(employees, new Employee("Ivanov Ivan Sergeevich", 2, random.nextInt(100_000) + 100_000));
        addEmployee(employees, new Employee("Ivanov Ivan Mihailovich", 3, random.nextInt(100_000) + 100_000));
        addEmployee(employees, new Employee("Ivanov Ivan Genadevich", 4, random.nextInt(100_000) + 100_000));
        addEmployee(employees, new Employee("Ivanov Ivan Dmitrievich", 5, random.nextInt(100_000) + 100_000));
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

    public double averageSum() {
        double averageSum = sum / employees.length;
        return averageSum;
    }

    public double maxSum() {
        double max = Double.MIN_VALUE;
        for (Employee employee : employees) {
            int value = employee.getSalary();
            if (value > max) {
                max = value;
            }
        }
        return max;

    }

    public double minSum() {
        double min = Double.MAX_VALUE;
        for (Employee employee : employees) {
            int value = employee.getSalary();
            if (value < min) {
                min = value;
            }
        }
        return min;
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









































