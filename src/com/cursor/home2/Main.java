package com.cursor.home2;

import com.cursor.home2.robot.RobotJohnnyMnemonicV1;
import com.cursor.home2.robot.RobotJohnnyMnemonicV2;
import com.cursor.home2.robot.RobotJohnnyMnemonicV3;
import com.cursor.home2.utils.RobotUtils;

public class Main {
    public static void main(String[] args) {

        RobotUtils robotUtils = new RobotUtils();

        RobotJohnnyMnemonicV1 robotJohnnyMnemonicV1 = new RobotJohnnyMnemonicV1("Sentinal", 80, 830, "default");
        robotUtils.robotUtils(robotJohnnyMnemonicV1);

        RobotJohnnyMnemonicV2 robotJohnnyMnemonicV2 = new RobotJohnnyMnemonicV2("Ironhide", 104, 843, "default");
        robotUtils.robotUtils(robotJohnnyMnemonicV2);

        RobotJohnnyMnemonicV3 robotJohnnyMnemonicV3 = new RobotJohnnyMnemonicV3("Prime", 110, 900, "default");
        robotUtils.robotUtils(robotJohnnyMnemonicV3);
    }
}
