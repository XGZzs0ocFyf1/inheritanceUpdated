package ru.gurzhiy.second.candidats;

import ru.gurzhiy.second.obstacles.Obstacle;

/**
 *Candidate for competition
 */
public interface Candidate {
      boolean overpass(Obstacle obstacle);
      double getMaxHeightInCentimeters();
      double getMaxDistanceInMeters();
}
