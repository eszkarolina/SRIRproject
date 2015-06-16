
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author karolina
 */
public class RMIClient {
    public static void main(String args[]){
        RMIClient client = new RMIClient();
        client.connectServer();
    }

    private void connectServer() {
        try{
           Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1099);
           RMI rmi = (RMI) reg.lookup("server");
           System.out.println("Połączono");
           String text = rmi.getData("Karolina");
           System.out.println(text);
           
           double result, value1, value2;
           Scanner scan = new Scanner(System.in);
           System.out.println("Podaj liczby:");
           if(scan.hasNextDouble()){
               
           
           value1 = scan.nextDouble();
           value2 = scan.nextDouble();
           result = rmi.avr(value1, value2);
           System.out.println("Srednia wynosi: "+result);
           }
           else{
           System.out.println("Nie podales liczby");
           }
           
         
            
        }catch(Exception e){
            System.out.println(e);
        }
 
    }
    
}
