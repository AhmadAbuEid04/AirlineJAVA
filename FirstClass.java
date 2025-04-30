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

public class FirstClass extends Passenger {
    private Luggage extraLuggage;
    
    public FirstClass(int ticketNo, double ticketPrice){
        super(ticketNo, ticketPrice);
        this.extraLuggage = new Luggage(1,25);
        
        
    }
    
    public void cancelTicket(){
        double price = super.getTicketPrice();
        JOptionPane.showMessageDialog(null, "Please note that you have a refund amount "+price);
        
    }
    
    public int getTicketNo(){
        return super.getTicketNo();
    }
    @Override
    public Luggage getLuggage(){
        this.extraLuggage = new Luggage(super.getLuggage().getNumOfBags()+extraLuggage.getNumOfBags()
                ,super.getLuggage().getWeight()+extraLuggage.getWeight());
        
        return this.extraLuggage;
    }
    
    @Override
    public String toString(){
        return "First Class\n"+super.toString();
    }
    
    
    
}
