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
public class HasCard implements ATMState {
       ATMMachine atmMachine;

     

    public HasCard(ATMMachine newATMMachine){

         

        atmMachine = newATMMachine;

         

    }

 

    public void insertCard() {

         

       System.out.println("Anda hanya bisa memasukkan satu kartu sekaligus");

         

   }

 

    public void ejectCard() {

         

        System.out.println("Kartu Anda dikeluarkan");

        atmMachine.setATMState(atmMachine.getNoCardState());

         

    }

 

    public void requestCash(int cashToWithdraw) {

         

        System.out.println("Anda belum memasukkan PIN Anda");

         

         

    }

 

    public void insertPin(int pinEntered) {

         

        if(pinEntered == 1234){

             

            System.out.println("Anda memasukkan PIN yang benar");

            atmMachine.correctPinEntered = true;

            atmMachine.setATMState(atmMachine.getHasPin());

             

        } else {

             

            System.out.println("Anda salah memasukkan PIN");

            atmMachine.correctPinEntered = false;

            System.out.println("Kartu Anda dikeluarkan");

            atmMachine.setATMState(atmMachine.getNoCardState());
        }
        
    }              

 }  

       

