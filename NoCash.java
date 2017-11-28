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
public class NoCash implements ATMState {
     ATMMachine atmMachine;

     

    public NoCash(ATMMachine newATMMachine){

         

        atmMachine = newATMMachine;

         

    }

 

    public void insertCard() {

         

        System.out.println("Kami tidak punya uang");

        System.out.println("Kartu Anda dikeluarkan");

         

    }

 

    public void ejectCard() {

         

        System.out.println("Kami tidak punya uang");

        System.out.println("Tidak ada uang yang bisa dikeluarkan");

         

    }

 

    public void requestCash(int cashToWithdraw) {

         

        System.out.println("Kami tidak punya uang");

         

    }

 

    public void insertPin(int pinEntered) {

         

        System.out.println("Kami tidak punya uang");
    }
        
    
     

    }  

