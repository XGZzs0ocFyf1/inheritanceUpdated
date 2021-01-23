package ru.gurzhiy.second.obstacles;

public class Distance implements Obstacle{
    private double lengthInMeters;

    public Distance(double lengthInMeters) {
        this.lengthInMeters = lengthInMeters;
    }

    public double getLengthInMeters() {
        return lengthInMeters;
    }

    @Override
    public boolean pass(double passValue) {
        return lengthInMeters < passValue;
    }
}
