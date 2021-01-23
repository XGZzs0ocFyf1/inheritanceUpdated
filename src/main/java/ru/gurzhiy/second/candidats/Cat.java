package ru.gurzhiy.second.candidats;

import ru.gurzhiy.second.Utils;
import ru.gurzhiy.second.obstacles.Obstacle;

public class Cat implements Candidate {

    private Utils utils = new Utils();

    private double maxHeightInCentimeters;
    private double maxDistanceInMeters;
    private String identity = "Котик";

    public Cat() {
        maxDistanceInMeters = 200;
        maxHeightInCentimeters = 100;
    }

    public Cat(double maxHeightInCentimeters, double maxDistanceInMeters) {
        this.maxHeightInCentimeters = maxHeightInCentimeters;
        this.maxDistanceInMeters = maxDistanceInMeters;
    }

    @Override
    public boolean overpass(Obstacle obstacle) {
        return utils.overpass(obstacle, this);
    }

    @Override
    public double getMaxHeightInCentimeters() {
        return maxHeightInCentimeters;
    }

    @Override
    public double getMaxDistanceInMeters() {
        return maxDistanceInMeters;
    }

    @Override
    public String toString() {
        return identity;
    }
}
