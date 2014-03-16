/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wc.storage.other;

import wc.storage.motor.WCJaguar;
import wc.storage.motor.WCMotor;
import wc.storage.motor.WCMotorFactory;

/**
 *
 * @author Saumik
 */
public class WCData
{
    public WCData()
    {
        motorFactory = new WCJaguar.Factory();
        
        RFMotor = motorFactory.makeMotor(1);
        RBMotor = motorFactory.makeMotor(2);
        LFMotor = motorFactory.makeMotor(3);
        LBMotor = motorFactory.makeMotor(4);
    }
    public WCMotorFactory motorFactory;
    public WCMotor RFMotor;
    public WCMotor RBMotor;
    public WCMotor LFMotor;
    public WCMotor LBMotor;
}
