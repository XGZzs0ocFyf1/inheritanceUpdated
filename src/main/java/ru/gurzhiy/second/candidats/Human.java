package ru.gurzhiy.second.candidats;

import ru.gurzhiy.second.Utils;
import ru.gurzhiy.second.obstacles.Obstacle;

public class Human implements Candidate {

    private Utils utils = new Utils();
    private double maxHeightInCentimeters;
    private double maxDistanceInMeters;
    private String identity = "Человек";

    public Human() {
        maxHeightInCentimeters = 200;
        maxDistanceInMeters = 800;
    }

    public Human(double maxHeightInCentimeters, double runDistance) {
        this.maxHeightInCentimeters = maxHeightInCentimeters;
        this.maxDistanceInMeters = runDistance;
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
    public boolean overpass(Obstacle obstacle) {
        return utils.overpass(obstacle, this);
    }

    @Override
    public String toString() {
        return identity;
    }


}
