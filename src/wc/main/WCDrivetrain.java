/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wc.main;

import wc.storage.other.WCStorage;
/**
 *
 * @author Saumik
 */
public class WCDrivetrain
{
    double speedStrafe;
    double speedRotate;
    double angle;
    double anglePlusPi;
    
    double lf;
    double rf;
    double rb;
    double lb;
    
    public wc.storage.other.WCStorage Storage;
    
    {
        Storage = new wc.storage.other.WCStorage();
    }
    
    public void update()
    {
        steerWheel();
    }
        
    public void joystick()
    {       
        Storage.data.LFMotor.setX(speedStrafe * Math.sin(anglePlusPi) + speedRotate);
        Storage.data.RFMotor.setX(speedStrafe * Math.cos(anglePlusPi) + speedRotate);
        Storage.data.RBMotor.setX(speedStrafe * Math.cos(anglePlusPi) + speedRotate);
        Storage.data.LBMotor.setX(speedStrafe * Math.sin(anglePlusPi) + speedRotate);
    }
    
    public void steerWheel()
    {
        //angle = Storage.wheel.DIRECTION.getVal();
        anglePlusPi = Storage.wheel.DIRECTION.getVal() + Math.PI/4;
        speedStrafe = Storage.pedal.ACCEL.getVal();
        speedRotate = Math.abs(Storage.wheel.DIRECTION.getVal() / (2 * Math.PI));
        
        if(!isBrakePress())
        {
            if(!canRotate())
            {
                lf = speedStrafe * Math.sin(anglePlusPi);
                rf = speedStrafe * Math.cos(anglePlusPi);
                
                if(isBackwards())
                {
                    lf = -lf;
                    rf = -rf;
                }
                
                Storage.data.LFMotor.setX(lf);
                Storage.data.RFMotor.setX(rf);
                Storage.data.RBMotor.setX(lf);
                Storage.data.LBMotor.setX(rf);
            }
            else
            {
                lf = speedRotate;
                rf = -speedRotate;
               
                Storage.data.LFMotor.setX(lf);
                Storage.data.RFMotor.setX(rf);
                Storage.data.RBMotor.setX(lf);
                Storage.data.LBMotor.setX(rf);
            }
        }       
    }
    
    public boolean isBrakePress()
    {
        if(Storage.pedal.BRAKE.getVal() != 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean canRotate()
    {
        if(Storage.pedal.ACCEL.getVal() == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isBackwards()
    {
        return false;
    }
}
