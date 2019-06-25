package com.cursor.wh2robot.utils;

import com.cursor.wh2robot.robot.RobotJohnnyMnemonicV1;
import com.cursor.wh2robot.robot.RobotJohnnyMnemonicV2;
import com.cursor.wh2robot.robot.RobotJohnnyMnemonicV3;
import com.cursor.wh2robot.planet.PlanetArrival;

public class RobotUtils {
    RandomUtils randomUtils = new RandomUtils();
    PlanetArrival planetArrival = new PlanetArrival();

    public void robotUtils(RobotJohnnyMnemonicV1 robotJohnnyMnemonicV1) {
        System.out.println(robotJohnnyMnemonicV1.getName());
        System.out.println(robotJohnnyMnemonicV1.getWeight());
        System.out.println(robotJohnnyMnemonicV1.getHeignt());
        robotJohnnyMnemonicV1.move();
        robotJohnnyMnemonicV1.shoot();
        robotJohnnyMnemonicV1.talk();
        robotJohnnyMnemonicV1.armor();
        robotJohnnyMnemonicV1.shootForEveryone();
        planetArrival.getName();
        randomUtils.generateRandomNumb();
    }

    public void robotUtils(RobotJohnnyMnemonicV2 robotJohnnyMnemonicV2) {
        System.out.println(robotJohnnyMnemonicV2.getName());
        System.out.println(robotJohnnyMnemonicV2.getWeight());
        System.out.println(robotJohnnyMnemonicV2.getHeignt());
        robotJohnnyMnemonicV2.move();
        robotJohnnyMnemonicV2.shoot();
        robotJohnnyMnemonicV2.talk();
        robotJohnnyMnemonicV2.armor();
        robotJohnnyMnemonicV2.shootForEveryone();
        randomUtils.generateRandomNumb();
    }

    public void robotUtils(RobotJohnnyMnemonicV3 robotJohnnyMnemonicV3) {
        System.out.println(robotJohnnyMnemonicV3.getName());
        System.out.println(robotJohnnyMnemonicV3.getWeight());
        System.out.println(robotJohnnyMnemonicV3.getHeignt());
        robotJohnnyMnemonicV3.move();
        robotJohnnyMnemonicV3.shoot();
        robotJohnnyMnemonicV3.talk();
        robotJohnnyMnemonicV3.armor();
        robotJohnnyMnemonicV3.shootForEveryone();
        randomUtils.generateRandomNumb();
        randomUtils.generateRandomPlen();
    }
}
