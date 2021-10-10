/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Miguel
 */
public interface Observable {
    
    public void notifyChange();
    public void attachObserver(Interfaces.Observer observer);
}
