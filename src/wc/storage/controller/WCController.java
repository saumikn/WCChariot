/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wc.storage.controller;

/**
 *
 * @author Saumik
 */
public interface WCController
{
    public WCAxis[] getAllAxes();
    public WCButton[] getAllButtons();
    public WCAxis getAxis(int port);
    public WCButton getButton(int port);
}
