package main.com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        var firstPoint = new Point();

        double x1, x2, y1, y2;

        System.out.print("Введите x1=");

        x1 = scanner.nextDouble();
        System.out.println();

        System.out.print("Введите y1=");

        y1 = scanner.nextDouble();
        System.out.println();

        firstPoint.setX(x1);

        firstPoint.setY(y1);

        System.out.print("Введите x2=");

        x2 = scanner.nextDouble();
        System.out.println();

        System.out.print("Введите y2=");

        y2 = scanner.nextDouble();
        System.out.println();

        var secondPoint = new Point(x2, y2);

        var segment = new Segment(firstPoint, secondPoint);
        System.out.println("Расстояние = " + segment.Calculate());
    }
}