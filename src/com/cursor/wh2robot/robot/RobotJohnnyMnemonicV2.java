package com.cursor.wh2robot.robot;

public class RobotJohnnyMnemonicV2 extends RobotJohnnyMnemonicV1 implements RobotCapabilities {
    public static final String VERSION = "Johnny Mnemonic Version";
    public static final String PROTECTED_TITANIUM = "Protection from titanium armor 100%";
    public static final String CONECTED_5G = "CONECTED_USE_5G";

    public RobotJohnnyMnemonicV2() {
    }

    public RobotJohnnyMnemonicV2(String name, int weight, int heignt, String adaptation) {
        super(name, weight, heignt, adaptation);
    }
    @Override
    public void move() {
        System.out.println("Status:" + "The robot move");
    }

    @Override
    public void shoot() {
        System.out.println("Status:" + "The robot started firing");
    }

    @Override
    public void talk() {
        System.out.println("Status:" + "The robot started say " + VERSION + CONECTED_5G);
    }

    @Override
    public void armor() {
        System.out.println("Status:" + "Robot " + PROTECTED_TITANIUM);
    }

    @Override
    public void shootForEveryone() {
        System.out.println("Status" + " The robot shoots on all people");
    }




}
