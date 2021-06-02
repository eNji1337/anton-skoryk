package org.example;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(one(5, 8));
        two(-7);
        System.out.println(three(-1));
        four();
        five(2021);
        six();
        seven();
        eight();
        eight_one(5);
        nine(5,6);
        ninth_1();
        System.out.println(ten(new int[]{1, 1, 1, 2, 1}));
        System.out.println(ten(new int[]{2, 1, 1, 2, 1}));
        System.out.println(ten(new int[]{10, 10}));
        eleven(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, -2);
    }
    static boolean one(int a, int b) {
        System.out.println("\n Задание 1.");
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            return true;
        }
        else {
            return false;
        }
    }
    static void two(int a) {
        System.out.println("\n Задание 2.");
        if (a >= 0) {
            System.out.println("Число " + a + "положительное");
        }
        else {
            System.out.println("Число " + a + " отрицательное");
        }
    }
    static boolean three(int a) {
        System.out.println("\n Задание 3.");
        if (a < 0) {
            return true;
        }
        return false;
    }
    static void four() {
        System.out.println("\n Задание 4.");
        int d = 5;
        String st = "line";
        for (int i = 0; i < d; i++) {
            System.out.println(st);
        }
    }
    static void five(int year) {
        System.out.println("\n Задание 5.");
        if (!(year % 4 == 0) || ((year % 100 == 0) && !(year % 400 == 0))) {
            System.out.println(year + " г. не високосный");
        }
        else {
            System.out.println(year + " г. високосный");
        }
    }
    static void six() {
        System.out.println("\n Задание 6.");
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("BEFORE: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) {
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
        }
        System.out.print("\nAFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    static void seven() {
        System.out.println("\n Задание 7.");
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] =  i +1;
            System.out.println(array[i]);
        }
    }
    static void eight() {
        System.out.println("\n Задание 8.");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("\n AFTER:  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.print(arr[i] + " ");
        }
    }
    static void eight_one(int size) {
        System.out.println("\n Задание 8.1");
        int[][] sqrArray = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                sqrArray[i][j] = (i == j || j == (size - i - 1)) ? 1 : (int) (Math.random() * 100);
                System.out.printf("%4d", sqrArray[i][j]);
            }
        }
    }
    static void nine(int len, int initialValue) {
        System.out.println("\n Задание 9.");
        int[] array5 = new int[len];
        for (int i = 0; i < len; i++) {
            array5[i] = initialValue;
            System.out.println(initialValue);
        }
    }
    static void ninth_1() {
        System.out.println("\n Задание 9_1.");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1, -9};
        int min = arr[0];
        int max = arr[0];
        System.out.print("in array: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        System.out.println("\nminimal element is: " + min + "\nmaximal element is: " + max);
    }
    static boolean ten(int[] arr) {
        System.out.println("\n Задание 10.");
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.length + 1; i++) {
            leftSum = 0;
            rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }
            for (int j = i; j < arr.length; j++) {
                rightSum += arr[j];
            }
            if (leftSum == rightSum) {
                return true;
            }
        }
        return false;
    }
    static void eleven(int[] arr, int n) {
        System.out.println("\n Задание 11.");
        System.out.print("BEFORE: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.print("(n = " + n + ")");

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                // Right
                int tmp = arr[arr.length - 1];
                for (int j = arr.length - 1; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = tmp;
            }
        }
        else if (n < 0) {
            for (int i = 0; i < n * (-1); i++) {
                // Left
                int tmp = arr[0];
                for (int j = 0; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = tmp;
            }
        }
        System.out.print("\n AFTER:  ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

