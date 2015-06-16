
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karolina
 */
public class RMIServer extends UnicastRemoteObject implements RMI{
  
    public RMIServer() throws RemoteException{
        super();
    }
    public String getData(String s) throws RemoteException{
        s = "Hi "+s;
        return s;
    }
    
    public double avr(double d1, double d2) throws RemoteException{
        return (d1+d2)/2;
        
    }
    
    public static void main(String args[]){
        try{
            Registry reg  = LocateRegistry.createRegistry(1099);
            reg.rebind("server", new RMIServer());
            System.out.println("Server wystartował");
            
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
