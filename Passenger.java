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

public class Passenger {
    protected String name;
    protected Luggage luggage;
    protected int passNo;
    protected int ticketNo;
    protected double ticketPrice;
    
    public Passenger(int ticketNo, double ticketPrice){
        this.ticketNo = ticketNo;
        this.ticketPrice = ticketPrice;
        this.name = JOptionPane.showInputDialog("Enter passenger's name:");
        String ticket = JOptionPane.showInputDialog("Enter ticket number:");
        this.ticketNo = Integer.parseInt(ticket);
        String lug = JOptionPane.showInputDialog("Do you want to pay for more luggage?(y/n)");
        if(lug.toLowerCase().equals("y")){
            String addBag = JOptionPane.showInputDialog("Enter number of bags to add:");
            String extraWeight = JOptionPane.showInputDialog("Enter weight of additional bag:");
            int bags = Integer.parseInt(addBag);
            double extra = Double.parseDouble(extraWeight);
            this.luggage = new Luggage(1+bags,extra+25);
        }else{
            this.luggage = new Luggage(1,25);
        }
        
    }
    
    public Luggage getLuggage(){
        return this.luggage;
    }
    
    public double getTicketPrice(){
        return this.ticketPrice;
    }
    
    public int getPassNo(){
        return this.passNo;
    }
    public int getTicketNo(){
        return this.ticketNo;
    }
   
    
    @Override
    public String toString(){
        return "Ticket#: "+this.ticketNo+"\nPassenger name: " + this.name+"\nLuggage: "+this.luggage.toString();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this instanceof Economy && obj instanceof Economy) {
            return true;
        }
        if (this instanceof FirstClass && obj instanceof FirstClass) {
            return true;
        }
        return false;
    }
}
