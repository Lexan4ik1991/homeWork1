package homeWork3;

import java.util.*;
import java.util.ArrayList;
import java.util.HashSet;
//Пройти по списку из задания 2 с урока и удалить повторяющиеся элементы.

public class Task3 {
    public static void main(String[] args) {
//
        ex2();
    }

    public static void ex2() {
        List<String> planets = new ArrayList<>();
        Map<String, Integer> planetCount = new HashMap<>();
        Random rand = new Random();

        String[] solarSystemPlanets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune"};
        for (int i = 0; i < 10; i++) {
            int randIndex = rand.nextInt(solarSystemPlanets.length);
            planets.add(solarSystemPlanets[randIndex]);
        }
        System.out.printf("%s%n",planets);


//        for (String planet : planets) {
//            System.out.printf("%s\t%s", planet, Collections.frequency(planets, planet));
//    }

        for (String planet : planets) {
            if (planetCount.containsKey(planet)) {
                planetCount.put(planet, planetCount.get(planet) + 1);
            } else {
                planetCount.put(planet, 1);
            }
        }

        for (String planet : planetCount.keySet()) {
            System.out.printf("%s\t%s%n", planet, planetCount.get(planet));
        }
        Set<String> uniquePlanets = new HashSet<>(planets);
        System.out.println(uniquePlanets);

    }
}
