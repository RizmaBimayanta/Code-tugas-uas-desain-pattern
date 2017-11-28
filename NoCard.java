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
public class NoCard implements ATMState {
      ATMMachine atmMachine;

     

    public NoCard(ATMMachine newATMMachine){

         

        atmMachine = newATMMachine;

         

    }

 

    public void insertCard() {

         

        System.out.println("Silahkan masukkan pin anda");

        atmMachine.setATMState(atmMachine.getYesCardState());

         

    }

 

    public void ejectCard() {

         

        System.out.println("Anda tidak memasukkan kartu");

         

    }

 

    public void requestCash(int cashToWithdraw) {

         

        System.out.println("Anda belum memasukkan kartu Anda");

         

    }

 

    public void insertPin(int pinEntered) {

         

        System.out.println("Anda belum memasukkan kartu Anda");
        
        
    }
             

    }  

