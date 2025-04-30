/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment5;

/**
 *
 * @author ahmad0512
 */
import java.util.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Flight {
    private ArrayList<Passenger> passengers = new ArrayList <Passenger> (0);
    private int number;
    private double normalPrice;
    
    public Flight(int number, double normalPrice){
        this.number = number;
        this.normalPrice = normalPrice;
        
    }
    
    public void addPassenger(){
         String psngr = JOptionPane.showInputDialog("Enter number of choice:\n1.Economy\n2.First Class");
         if(psngr.equals("1")){
             int ticketNum = (Integer)(Integer.parseInt(JOptionPane.showInputDialog("Enter ticket number:")));
             Economy pass = new Economy(ticketNum, normalPrice);
         }else if(psngr.equals("2")){
             int ticketNum = (Integer)(Integer.parseInt(JOptionPane.showInputDialog("Enter ticket number:")));
             FirstClass firtspass = new FirstClass(ticketNum, 2*normalPrice);
         }
    }
    
    public boolean removeFirstClass(){
        int passportNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter passport number:"));
        
        for(Passenger pass : passengers){
            if(pass.getPassNo() == passportNumber){
                for( Passenger pass2: passengers){
                    if(pass instanceof FirstClass){
                        passengers.remove(pass2);
                        return true;
                    }
                }
            }
        }
        
        return false;
        
    }
    
    public boolean removeEconomy(){
        int passportNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter passport number:"));
        for(Passenger pass : passengers){
            if(pass.getPassNo() == passportNumber){
                for( Passenger pass2: passengers){
                    if(pass instanceof Economy){
                        passengers.remove(pass2);
                        return true;
                    }
                }
            }
        }
        return false;
    }
    
    public ArrayList<Passenger> getPassengers() {
        
        return new ArrayList<Passenger>(); // Return a copy to preserve encapsulation
    }
    
    public int getNumOfPassengers(){
        return passengers.size();
    }
    
    public int getFlightNum(){
        return this.number;
    }
    
    @Override
    public boolean equals(Object o){
        if(this.getNumOfPassengers() == ((Flight)o).getNumOfPassengers()){
            return true;
        }
        return false;
    }
    
    
}
