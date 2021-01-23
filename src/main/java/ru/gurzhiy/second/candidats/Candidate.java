package ru.gurzhiy.second.candidats;

import ru.gurzhiy.second.obstacles.Obstacle;

public interface Candidate {

      boolean overpass(Obstacle obstacle);
      double getMaxHeightInCentimeters();
      double getMaxDistanceInMeters();

}
