package org.example.task3;

import java.util.Scanner;

public class Main {
    static int count = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double distanceRun = 200;
        double distanceSwim =  0;
        Cat cat = new Cat(distanceRun, distanceSwim);
        count++;
        distanceRun =  500;
        distanceSwim =  10;
        Animal dog = new Dog(distanceRun, distanceSwim);
        count++;
        System.out.println("Введите дистанцию для бега:");
        double distance = scanner.nextDouble();

        System.out.println("Кошка пробежала(" + distance + "). Результат: " + cat.run(distance));
        System.out.println("Собака пробежала(" + distance + "). Результат: " + dog.run(distance));

        System.out.println("Введите дистанцию для плавания:");
        distance = scanner.nextDouble();

        System.out.println("Кошка плывет (" + distance + "). Результат: " + cat.swim(distance));
        System.out.println("Собака плывет(" + distance + "). Результат: " + dog.swim(distance));
        System.out.println("Общее количество котов и собак = " + count);
    }
}


