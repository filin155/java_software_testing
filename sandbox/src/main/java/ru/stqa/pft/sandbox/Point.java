package ru.stqa.pft.sandbox;

public class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance (Point p2) {
        return Math.round(Math.sqrt(Math.pow((p2.x - this.x) , 2) + Math.pow((p2.y - this.y), 2)) * 100) / 100D;
        //return Math.sqrt(Math.pow((p2.x - this.x) , 2) + Math.pow((p2.y - this.y), 2));
    }

}
