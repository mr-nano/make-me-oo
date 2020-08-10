package org.oop;

public class DistanceAndDirectionCalculator {
    public static double distance(Point from, Point to) {
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    public static double direction(Point from, Point to) {
        double xDistance = to.getX() - from.getX();
        double yDistance = to.getY() - from.getY();
        return Math.atan2(yDistance, xDistance);
    }
}
