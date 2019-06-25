package cursor.home2.utils;


import cursor.home2.planet.PlanetArrival;
import cursor.home2.robot.RobotJohnnyMnemonicV1;
import cursor.home2.robot.RobotJohnnyMnemonicV2;
import cursor.home2.robot.RobotJohnnyMnemonicV3;

public class RobotUtils {
    RandomUtils randomUtils = new RandomUtils();
    PlanetArrival planetArrival = new PlanetArrival();

    public void printRobotActionsPlanetInfoOne(RobotJohnnyMnemonicV1 robotJohnnyMnemonicV1) {
        System.out.println(robotJohnnyMnemonicV1.getName());
        System.out.println(robotJohnnyMnemonicV1.getWeight());
        System.out.println(robotJohnnyMnemonicV1.getHeignt());
        robotJohnnyMnemonicV1.move();
        robotJohnnyMnemonicV1.shoot();
        robotJohnnyMnemonicV1.talk();
        robotJohnnyMnemonicV1.armor();
        robotJohnnyMnemonicV1.shootForEveryone();
        planetArrival.getName();
        randomUtils.generateRandomNumber();
    }

    public void printRobotActionsPlanetInfoTwo(RobotJohnnyMnemonicV2 robotJohnnyMnemonicV2) {
        System.out.println(robotJohnnyMnemonicV2.getName());
        System.out.println(robotJohnnyMnemonicV2.getWeight());
        System.out.println(robotJohnnyMnemonicV2.getHeignt());
        robotJohnnyMnemonicV2.move();
        robotJohnnyMnemonicV2.shoot();
        robotJohnnyMnemonicV2.talk();
        robotJohnnyMnemonicV2.armor();
        robotJohnnyMnemonicV2.shootForEveryone();
        randomUtils.generateRandomNumber();
    }

    public void printRobotActionsPlanetInfoThree(RobotJohnnyMnemonicV3 robotJohnnyMnemonicV3) {
        System.out.println(robotJohnnyMnemonicV3.getName());
        System.out.println(robotJohnnyMnemonicV3.getWeight());
        System.out.println(robotJohnnyMnemonicV3.getHeignt());
        robotJohnnyMnemonicV3.move();
        robotJohnnyMnemonicV3.shoot();
        robotJohnnyMnemonicV3.talk();
        robotJohnnyMnemonicV3.armor();
        robotJohnnyMnemonicV3.shootForEveryone();
        randomUtils.generateRandomNumber();
        randomUtils.generateRandomPlanet();
    }
}
