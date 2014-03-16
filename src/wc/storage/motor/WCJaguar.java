/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wc.storage.motor;

import edu.wpi.first.wpilibj.Jaguar;

/**
 *
 * @author Saumik
 */
public class WCJaguar implements WCMotor
{
    Jaguar jag;
    public WCJaguar(int port)
    {
        jag = new Jaguar(port);
    }
    public void setX(double x)
    {
        jag.set(x);
    }
    
    public static class Factory implements WCMotorFactory
    {
        public WCMotor makeMotor(int port)
        {
            return new WCJaguar(port);
        }
    }
}