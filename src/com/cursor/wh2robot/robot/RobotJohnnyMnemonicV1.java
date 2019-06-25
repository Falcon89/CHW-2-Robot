package com.cursor.wh2robot.robot;

public class RobotJohnnyMnemonicV1 implements RobotCapabilities {
    public static final String VERSION = "Johnny Mnemonic Version";
    public static final String PROTECTED_TITANIUM = "Protection from titanium armor 100%";
    private String name;
    private int weight;
    private int heignt;
    private String adaptation;

    public RobotJohnnyMnemonicV1() {
    }

    public RobotJohnnyMnemonicV1(String name, int weight, int heignt, String adaptation) {
        this.name = name;
        this.weight = weight;
        this.heignt = heignt;
        this.adaptation = adaptation;
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
        System.out.println("Status:" + "The robot started say " + VERSION);
    }

    @Override
    public void armor() {
        System.out.println("Status:" + "Robot " + PROTECTED_TITANIUM);
    }

    @Override
    public void shootForEveryone() {
        System.out.println("Status" + "The robot shoots on all people");
    }


    public static String getProtectedTitanium() {
        return PROTECTED_TITANIUM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeignt() {
        return heignt;
    }

    public void setHeignt(int heignt) {
        this.heignt = heignt;
    }

    public String getAdaptation() {
        return adaptation;
    }

    public void setAdaptation(String adaptation) {
        this.adaptation = adaptation;
    }

    @Override
    public String toString() {
        return "RobotJohnnyMnemonicV1{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", heignt=" + heignt +
                ", adaptation='" + adaptation + '\'' +
                '}';
    }
}
