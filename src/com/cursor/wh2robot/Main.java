package com.cursor.wh2robot;

import com.cursor.wh2robot.Utils.RandomUtils;
import com.cursor.wh2robot.robot.RobotJohnnyMnemonicV1;
import com.cursor.wh2robot.robot.RobotJohnnyMnemonicV2;
import com.cursor.wh2robot.robot.RobotJohnnyMnemonicV3;
import com.cursor.wh2robot.robot.planet.PlanetArrival;

public class Main {
    /**
     * Created by V.Kachala on 24/06/2019.
     */
//  Task
  /*1. Create a robot and its 2 newer versions, let it shoot, shout something, and move. Make him "strong armor"
    so that nobody could reprogram him and make a mistake in his system so that he cursed all people. Make a controller
    that will issue a random number from 1 to 12 (see Random ()) and if the batch is from 1-3
    then the robot will take the form 1, 4-8 form 2 and 9-12 form 3.*/
//  Addition to the task.
  /*2. Your work was kidnapped by planet and it is known that they fly in a certain galaxy which consists of three planets:
    the planet of the seas, the wind, and the sun. Your robot is not adapted to such conditions and he is there.
    In order not to happen, you need to redo it so that the corresponding planet will be transformed accordingly.
    Where to fly non-planets - not known, can on planet A, can B, and can and C. If A will be an implemention of Work Under the sea, V-wind, С-sun.
    Make also a rand, but the rand drop out have the letters (A-C).*/
    public static void main(String[] args) {
        RandomUtils randomUtils = new RandomUtils();
        PlanetArrival planetArrival = new PlanetArrival();


        RobotJohnnyMnemonicV1 robotJohnnyMnemonicV1 = new RobotJohnnyMnemonicV1("Sentinal", 80, 830, "default");
        RobotJohnnyMnemonicV2 robotJohnnyMnemonicV2 = new RobotJohnnyMnemonicV2("Ironhide", 104, 843, "default");
        RobotJohnnyMnemonicV3 robotJohnnyMnemonicV3 = new RobotJohnnyMnemonicV3("Prime", 110, 900, "default");

        System.out.println("*******************************");
        System.out.println(robotJohnnyMnemonicV1.getName());
        System.out.println(robotJohnnyMnemonicV1.getWeight());
        System.out.println(robotJohnnyMnemonicV1.getHeignt());
        robotJohnnyMnemonicV1.move();
        robotJohnnyMnemonicV1.shoot();
        robotJohnnyMnemonicV1.talk();
        robotJohnnyMnemonicV1.armor();
        robotJohnnyMnemonicV1.shootForEveryone();
        planetArrival.getName();
        randomUtils.generatorNumber();
        System.out.println("*******************************");


        System.out.println("*******************************");
        System.out.println(robotJohnnyMnemonicV2.getName());
        System.out.println(robotJohnnyMnemonicV2.getWeight());
        System.out.println(robotJohnnyMnemonicV2.getHeignt());
        robotJohnnyMnemonicV3.move();
        robotJohnnyMnemonicV3.shoot();
        robotJohnnyMnemonicV3.talk();
        robotJohnnyMnemonicV3.armor();
        robotJohnnyMnemonicV3.shootForEveryone();
        randomUtils.generatorNumber();


        System.out.println("*******************************");
        System.out.println(robotJohnnyMnemonicV3.getName());
        System.out.println(robotJohnnyMnemonicV3.getWeight());
        System.out.println(robotJohnnyMnemonicV3.getHeignt());
        robotJohnnyMnemonicV3.move();
        robotJohnnyMnemonicV3.shoot();
        robotJohnnyMnemonicV3.talk();
        robotJohnnyMnemonicV3.armor();
        robotJohnnyMnemonicV3.shootForEveryone();
        randomUtils.generatorNumber();

        System.out.println("*********************");
        randomUtils.randomPlanet();
        System.out.println("*********************");
    }
}
