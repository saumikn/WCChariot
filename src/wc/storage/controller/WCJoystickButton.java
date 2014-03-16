/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wc.storage.controller;

import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author Saumik
 */
public class WCJoystickButton implements WCButton
{
    int port;
    Joystick joy;
    boolean currentVal;
    boolean previousVal;
    
    public WCJoystickButton(int port, Joystick joy)
    {
        this.port = port;
        this.joy = joy;
    }
    
    public boolean getLeadingEdge()
    {
        boolean state = false;
        currentVal = joy.getRawButton(port);
        if(currentVal && !previousVal)
        {
            state = true;
        }
        return state;
    }
    
    public boolean getBackEdge()
    {
        boolean state = false;
        currentVal = joy.getRawButton(port);
        if(!currentVal && previousVal)
        {
            state = true;
        }
        return state;
    }
    
    public boolean getContinuous()
    {
        boolean state = false;
        currentVal = joy.getRawButton(port);
        if(currentVal && previousVal)
        {
            state = true;
        }
        return state;
    }
    
    public boolean getVal()
    {
        currentVal = joy.getRawButton(port);
        previousVal = currentVal;
        return currentVal;
    }
}
