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
public class Economy extends Passenger {
    
   public Economy(int ticketNo, double ticketPrice){
       super(ticketNo,ticketPrice);
       
   }
   
   public void cancelTicket(){
       JOptionPane.showMessageDialog(null,"Please note that there is no money refund for your ticket!");
       
   }
   
   @Override
   public String toString(){
       return "Economy\n"+super.toString();
   }
}
