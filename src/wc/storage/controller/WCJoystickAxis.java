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
public class WCJoystickAxis implements WCAxis
{
    int port;
    Joystick joy;
    
    public WCJoystickAxis(int port, Joystick joy)
    {
        this.port = port;
        this.joy = joy;
    }
    
    public double getVal()
    {
        return joy.getRawAxis(port);
    }
}
