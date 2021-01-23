package ru.gurzhiy.second;


import ru.gurzhiy.second.candidats.Candidate;
import ru.gurzhiy.second.candidats.Cat;
import ru.gurzhiy.second.candidats.Human;
import ru.gurzhiy.second.candidats.Robot;
import ru.gurzhiy.second.obstacles.Distance;
import ru.gurzhiy.second.obstacles.Obstacle;
import ru.gurzhiy.second.obstacles.Wall;

/**
 * Main class for out checks
 */
public class SecondMain {

    public static void main(String[] args) {

        Candidate[] candidates = {
                new Cat(),
                new Human(200, 800),
                new Robot()
        };

        Obstacle[] obstacles = {
                new Wall(50),
                new Wall(100),
                new Wall(150),
                new Wall(200),
                new Wall(250),
                new Distance(100),
                new Distance(200),
                new Distance(1000)
        };


        //здесь проверка реализована таким образом, что любое непройденное испытание
        //выводит участника из соревнования
        for (int candidateIdx = 0; candidateIdx < candidates.length; candidateIdx++) {
            for (int obstacleIdx = 0; obstacleIdx <  obstacles.length; obstacleIdx++) {
                if (!candidates[candidateIdx].overpass(obstacles[obstacleIdx])) break;
            }

        }


    }
}
