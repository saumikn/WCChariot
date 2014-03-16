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
public class WCSteeringWheel implements WCController
{
    private WCAxis[] Axes;
    private WCButton[] Buttons;
    
    Joystick wheel;
    public WCSteeringWheel(int WHEEL_PORT)
    {
        wheel = new Joystick(wc.storage.other.WCConstants.WHEEL_PORT);
        Axes = new WCAxis[12];
        for(int j = 0; j < Axes.length; j++)
        {
            Axes[j] = new WCJoystickAxis(j, wheel);
        }
        Buttons = new WCButton[12];
        for(int j = 0; j < Buttons.length; j++)
        {
            Buttons[j] = new WCJoystickButton(j, wheel);
        }
    }

    public final WCButton A_BUTTON = new WCJoystickButton(1, wheel);   
    
    public final WCAxis DIRECTION = new WCJoystickAxis(1, wheel);
    
    public WCAxis[] getAllAxes()
    {
        return Axes;
    }
    
    public WCButton[] getAllButtons()
    {
        return Buttons;
    }
    
    public WCAxis getAxis(int port)
    {
        return new WCJoystickAxis(port, wheel);
    }
    
    public WCButton getButton(int port)
    {
        return new WCJoystickButton(port, wheel);
    }
}
