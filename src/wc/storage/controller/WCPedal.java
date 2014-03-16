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
public class WCPedal implements WCController
{
    private WCAxis[] Axes;
    private WCButton[] Buttons;
    
    Joystick pedal;
    public WCPedal(int PEDAL_PORT)
    {
        pedal = new Joystick(wc.storage.other.WCConstants.WHEEL_PORT);
        Axes = new WCAxis[12];
        for(int j = 0; j < Axes.length; j++)
        {
            Axes[j] = new WCJoystickAxis(j, pedal);
        }
        Buttons = new WCButton[12];
        for(int j = 0; j < Buttons.length; j++)
        {
            Buttons[j] = new WCJoystickButton(j, pedal);
        }
    }

    public final WCButton A_BUTTON = new WCJoystickButton(1, pedal);   
    
    public final WCAxis ACCEL = new WCJoystickAxis(1, pedal);
    public final WCAxis BRAKE = new WCJoystickAxis(1, pedal);
    
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
        return new WCJoystickAxis(port, pedal);
    }
    
    public WCButton getButton(int port)
    {
        return new WCJoystickButton(port, pedal);
    }
}
