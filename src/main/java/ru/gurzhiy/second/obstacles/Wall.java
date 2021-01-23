package ru.gurzhiy.second.obstacles;


/**
 * wall
 */
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
