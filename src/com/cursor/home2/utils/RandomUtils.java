package com.cursor.home2.utils;

import com.cursor.home2.planet.PlanetArrival;

import java.util.Random;

public class RandomUtils {
    PlanetArrival planetArrival = new PlanetArrival();

    /**
     * Create method generateRandomNumber, on condition of task
     */
    public static void generateRandomNumber() {
        int min = 1;
        int max = 12;
        int minmax = max - min;
        Random random = new Random();
        int RundumNumber = random.nextInt(minmax + 1);
        if (RundumNumber >= 1 && RundumNumber <= 3) {
            System.out.println("*********************");
            System.out.println("Rundum number is " + RundumNumber + "--> It is version RobotJohnnyMnemonicV1 " +
                    " FORMA 1");
            System.out.println("*********************");
        } else if (RundumNumber >= 4 && RundumNumber <= 8) {
            System.out.println("Rundum number is " + RundumNumber + "--> It is version RobotJohnnyMnemonicV2" +
                    " FORMA 2");
            System.out.println("*********************");
        } else if (RundumNumber >= 9 && RundumNumber <= 12) {
            System.out.println("Rundum number is " + RundumNumber + "--> It is version RobotJohnnyMnemonicV3" +
                    " FORMA3");
            System.out.println("*********************");
        }
    }

    /**
     * Create method generateRandomPlenet, If the aliens stole the adaptation to the planet
     */
    public void generateRandomPlenet() {
        String alphabet = "ABC";
        Random letter = new Random();
        Character randomPlanetLatter = alphabet.charAt(letter.nextInt(alphabet.length()));
        if (randomPlanetLatter == 'A') {
            planetArrival.setName("thePlanetOfTheSeas");
            System.out.println("It is Planet of the Seas -->ADAPTATION ON");
            System.out.println(planetArrival.getName());
        } else if (randomPlanetLatter == 'B') {
            planetArrival.setName("thePlanetOfTheWind");
            System.out.println("It is Planet of the Wind -->ADAPTATION ON");
            System.out.println(planetArrival.getName());
        } else if (randomPlanetLatter == 'C') {
            planetArrival.setName("thePlanetOfTheSun");
            System.out.println("It is Planet of the Sun -->ADAPTATION ON");
            System.out.println(planetArrival.getName());
        }
    }
}
