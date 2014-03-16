/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wc.storage.other;

/**
 *
 * @author Dlock
 */
public interface WCConstants {
    public static final int XBOX_PORT = 1;
    public static final int WHEEL_PORT = 2;
    public static final int PEDAL_PORT = 3;
    
    //Buttons MAP
    public static final int A_BUTTON = 1;
    public static final int B_BUTTON = 2;
    public static final int X_BUTTON = 3;
    public static final int Y_BUTTON = 4;
    public static final int BACK_BUTTON = 7;
    public static final int START_BUTTON = 8;
    public static final int LEFT_BUMPER_BUTTON = 5;
    public static final int RIGHT_BUMPER_BUTTON = 6;
    public static final int LEFT_STICK_BUTTON = 9;
    public static final int RIGHT_STICK_BUTTON = 10;
    
    
    //Axii MAP
    public static final int LEFT_STICK_UP_DOWN_PORT = 2;
    public static final int LEFT_STICK_LEFT_RIGHT_PORT = 1;
    public static final int RIGHT_STICK_UP_DOWN_PORT = 5;
    public static final int RIGHT_STICK_LEFT_RIGHT_PORT = 4;
    public static final int TRIGGER_PORT = 3;
    public static final double LEFT_TRIGGER = 1.0;
    public static final double RIGHT_TRIGGER = -1.0;
    public static final int DPAD_LEFT_RIGHT_PORT = 6;
    public static final double LEFT_DPAD = -1.0;
    public static final double RIGHT_DPAD = 1.0;


    //DriveTrain
    public static final int FR_MOTOR_PORT = 2;
    public static final int BR_MOTOR_PORT = 3;
    public static final int FL_MOTOR_PORT = 4;
    public static final int BL_MOTOR_PORT = 5;
    public static final boolean IS_DT_CANBUS = true;
    public static final boolean IS_DT_VOLTAGE = false;
    public static final int FR_ENCODE_A = 1;
    public static final int BR_ENCODE_B = 2;
    public static final int FL_ENCODE_A = 3;
    public static final int BL_ENCODE_B = 4;
    public static final double WHEEL_CIRCUMFERENCE = 1;
    public static final double DT_RAMPRATE = 50;
    
    public static final double ENCODER_TEETH = 128;   
}
