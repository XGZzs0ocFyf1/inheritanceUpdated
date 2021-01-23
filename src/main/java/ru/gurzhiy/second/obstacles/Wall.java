package ru.gurzhiy.second.obstacles;

public class Wall implements Obstacle{

    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public boolean pass(double passValue) {
        return passValue >= height;
    }
}
