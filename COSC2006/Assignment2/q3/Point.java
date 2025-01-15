package COSC2006.q3;

import java.util.Arrays;

public class Point {
    public static void main(String[] args) {
        Point[] points = {
                new Point(0, 0),
                new Point(1, 1),
                new Point(2, 2),
                new Point(3, 3),
                new Point(4, 4)
        };

        Pair closestPair = findClosestPair(points);

        if (closestPair != null) {
            System.out.println(
                    "Closest pair of points is: {(" + closestPair.first.x + ", " + closestPair.first.y + ") and (" +
                            closestPair.second.x + ", " + closestPair.second.y + ")}");
        } else {
            System.out.println("Not enough point objects to make a pair.");
        }
    }

    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    static class Pair {
        Point first, second;

        public Pair(Point first, Point second) {
            this.first = first;
            this.second = second;
        }
    }

    public double distance(Point otherPoint) {
        return Math.sqrt((x - otherPoint.x) * (x - otherPoint.x) + (y - otherPoint.y) * (y - otherPoint.y));
    }

    public static Pair findClosestPair(Point[] points) {
        int n = points.length;
        if (n < 2) {
            return null;
        }

        // Sort the points based on x-coordinates
        Arrays.sort(points, (p1, p2) -> Integer.compare(p1.x, p2.x));

        double minDistance = Double.MAX_VALUE;
        Pair closestPair = null;

        // Compare each point
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                double dist = points[i].distance(points[j]);
                if (dist < minDistance) {
                    minDistance = dist;
                    closestPair = new Pair(points[i], points[j]);
                }
            }
        }

        return closestPair;
    }

}
