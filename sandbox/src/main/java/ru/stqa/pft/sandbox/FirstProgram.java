package ru.stqa.pft.sandbox;

public class FirstProgram {

    public static void main(String[] args) {

        Point p1 = new Point(0, 1);
        Point p2 = new Point(2, -2);

        System.out.println(p1.distance(p2));

    }

}
