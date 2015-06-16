
import java.rmi.Remote;
import java.rmi.RemoteException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karolina
 */
public interface RMI extends Remote {
    public String getData(String s) throws RemoteException;
    public double avr(double d1, double d2) throws RemoteException;
    
}
