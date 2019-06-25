package cursor.home2.robot;

public class RobotJohnnyMnemonicV3 extends RobotJohnnyMnemonicV1 {

    public RobotJohnnyMnemonicV3() {
    }

    public RobotJohnnyMnemonicV3(String name, int weight, int heignt, String adaptation) {
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
        System.out.println("Status:" + "The robot started say " + VERSION + CONECTED_5G + BATTERY_MA);
    }

    @Override
    public void armor() {
        System.out.println("Status:" + "Robot " + PROTECTED_TITANIUM);
    }

    @Override
    public void shootForEveryone() {
        System.out.println("Status" + "The robot shoots on all people");
    }


}
