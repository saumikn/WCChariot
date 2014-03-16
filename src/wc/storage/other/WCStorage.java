/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wc.storage.other;

/**
 *
 * @author Saumik
 */
public class WCStorage {
    public WCData data;
    public wc.storage.controller.WCXbox xbox;
    public wc.storage.controller.WCSteeringWheel wheel;
    public wc.storage.controller.WCPedal pedal;
     
    {
        data = new WCData();
        xbox = new wc.storage.controller.WCXbox(wc.storage.other.WCConstants.XBOX_PORT);
        wheel = new wc.storage.controller.WCSteeringWheel(wc.storage.other.WCConstants.WHEEL_PORT);
        pedal = new wc.storage.controller.WCPedal(wc.storage.other.WCConstants.PEDAL_PORT);
    }
}
