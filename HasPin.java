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
public class HasPin implements ATMState {
    ATMMachine atmMachine;

     

    public HasPin(ATMMachine newATMMachine){

         

        atmMachine = newATMMachine;

         

    }

 

    public void insertCard() {

         

        System.out.println("Anda sudah masuk kartu");

         

    }

 

    public void ejectCard() {

         

        System.out.println("Kartu Anda dikeluarkan");

        atmMachine.setATMState(atmMachine.getNoCardState());

         

    }

 

    public void requestCash(int cashToWithdraw) {

         

        if(cashToWithdraw > atmMachine.cashInMachine){

             

            System.out.println("Anda tidak memiliki banyak uang tunai yang tersedia");

            System.out.println("Kartu Anda dikeluarkan");

            atmMachine.setATMState(atmMachine.getNoCardState());

             

        } else {

             

            System.out.println(cashToWithdraw + " disediakan oleh mesin");

            atmMachine.setCashInMachine(atmMachine.cashInMachine - cashToWithdraw);

             

            System.out.println("Kartu Anda dikeluarkan");

            atmMachine.setATMState(atmMachine.getNoCardState());

             

            if(atmMachine.cashInMachine <= 0){

                 

                atmMachine.setATMState(atmMachine.getNoCashState());

                 

            }

        }

    }

 

    public void insertPin(int pinEntered) {

         

        System.out.println("Anda sudah memasukkan PIN");

    }
         
    }   

