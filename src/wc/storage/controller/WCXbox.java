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
public class WCXbox implements WCController
{
    private WCAxis[] Axes;
    private WCButton[] Buttons;
    
    Joystick xbox;
    public WCXbox(int XBOX_PORT)
    {
        xbox = new Joystick(wc.storage.other.WCConstants.XBOX_PORT);
        Axes = new WCAxis[12];
        for(int j = 0; j < Axes.length; j++)
        {
            Axes[j] = new WCJoystickAxis(j, xbox);
        }
        Buttons = new WCButton[12];
        for(int j = 0; j < Buttons.length; j++)
        {
            Buttons[j] = new WCJoystickButton(j, xbox);
        }
    }

    public final WCButton A_BUTTON = new WCJoystickButton(1, xbox);
    public final WCButton B_BUTTON = new WCJoystickButton(1, xbox);
    public final WCButton X_BUTTON = new WCJoystickButton(1, xbox);
    public final WCButton Y_BUTTON = new WCJoystickButton(1, xbox);
    public final WCButton LEFT_BUMPER_BUTTON = new WCJoystickButton(1, xbox);
    public final WCButton RIGHT_BUMPER_BUTTON = new WCJoystickButton(1, xbox);
    public final WCButton BACK_BUTTON = new WCJoystickButton(1, xbox);
    public final WCButton START_BUTTON = new WCJoystickButton(1, xbox);
    public final WCButton LEFT_STICK_BUTTON = new WCJoystickButton(1, xbox);
    public final WCButton RIGHT_STICK_BUTTON = new WCJoystickButton(1, xbox);
    
    
    public final WCAxis LEFT_STICK_LEFT_RIGHT = new WCJoystickAxis(1, xbox);
    public final WCAxis LEFT_STICK_UP_DOWN = new WCJoystickAxis(1, xbox);
    public final WCAxis TRIGGER = new WCJoystickAxis(1, xbox);
    public final WCAxis RIGHT_STICK_LEFT_RIGHT = new WCJoystickAxis(1, xbox);
    public final WCAxis RIGHT_STICK_UP_DOWN = new WCJoystickAxis(1, xbox);
    public final WCAxis DPAD_LEFT_RIGHT = new WCJoystickAxis(1, xbox);
    
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
        return new WCJoystickAxis(port, xbox);
    }
    
    public WCButton getButton(int port)
    {
        return new WCJoystickButton(port, xbox);
    }
}
