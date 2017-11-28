/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ATMMESIN;

/**
 *
 * @author BIMASU
 */
public class TestATMMachine {
    public static void main(String[] args){

         

        ATMMachine atmMachine = new ATMMachine();

      
        
        atmMachine.insertCard();

        atmMachine.insertPin(123456);
        
        atmMachine.insertCard();

        atmMachine.ejectCard();

        atmMachine.insertCard();    
        
        atmMachine.insertPin(1234);
         
        atmMachine.requestCash(6000);
         
        atmMachine.insertCard();
         
        atmMachine.insertPin(1234);
        
        atmMachine.requestCash(5000);
        
         atmMachine.insertCard();
         
        atmMachine.insertPin(1234);
        
        atmMachine.requestCash(5000);
        

    }  
}
