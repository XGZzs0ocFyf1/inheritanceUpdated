package ru.gurzhiy.second;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.gurzhiy.second.candidats.Candidate;
import ru.gurzhiy.second.obstacles.Distance;
import ru.gurzhiy.second.obstacles.Obstacle;
import ru.gurzhiy.second.obstacles.Wall;


public class Utils {

    public boolean overpass(Obstacle obstacle, Candidate candidate){

        Logger log = LoggerFactory.getLogger(candidate.getClass());

        if (obstacle instanceof Wall) {
            if (obstacle.pass(candidate.getMaxHeightInCentimeters())) {
                log.info(candidate + " перелез стену высотой {} см", ((Wall) obstacle).getHeight());
                return true;
            } else {
                log.info(candidate + " не перелез стену высотой {} см", ((Wall) obstacle).getHeight());
                return false;
            }
        }
        if (obstacle instanceof Distance) {
            if (obstacle.pass(candidate.getMaxDistanceInMeters())) {
                log.info(candidate + " пробежал робежал дистанцию {} м ", ((Distance) obstacle).getLengthInMeters());
                return true;
            } else {
                log.info(candidate + " не пробежал робежал дистанцию {} м ", ((Distance) obstacle).getLengthInMeters());
                return false;
            }
        }
        log.info(candidate + " удивленно смотрит на необычное препятствие");
        return false;
    }
}
