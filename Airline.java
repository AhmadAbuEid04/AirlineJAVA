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

public class Airline {
    private String name;
    private ArrayList <Flight> flights;
    
    public Airline(String name){
        this.name=name;
        this.flights = new ArrayList <Flight> (0);
    }
    
    public void addFlight(){
        int fNum = (Integer)(Integer.parseInt(JOptionPane.showInputDialog("Enter flight number:")));
        double price = (Double)(Double.parseDouble(JOptionPane.showInputDialog("Enter flight price:")));
        Flight flight = new Flight (fNum, price);
        flights.add(flight);
    }
    
    public void removeFlight(){
        int removed = (Integer)(Integer.parseInt(JOptionPane.showInputDialog("Enter flight number to be removed:")));
        for(Flight f: flights){
            if(f.getFlightNum()==removed){
                flights.remove(f);
            }else{
                JOptionPane.showMessageDialog(null, "Failed to remove flight: No flight with entered number!");
            }
        }
    }
    
    public boolean reserveFlight(int flightNumber){
        for(Flight f: flights){
            if(f.getFlightNum() == flightNumber){
                f.addPassenger();
                return true;
            }
        }
        JOptionPane.showMessageDialog(null, "Flight not found");
        return false;
    }
    
    public boolean cancelReservation(int flightNumber){
        
        for(Flight f: flights){
            if(f.getFlightNum() == flightNumber){
                int flightClass= (Integer)(Integer.parseInt(JOptionPane.showInputDialog("What class is the cancelled reservation?"
                        + "\n1.First Class\n2.Economy")));
                if(flightClass == 1){
                    if(!f.removeFirstClass()){
                        JOptionPane.showMessageDialog(null, "No first class passenger found with the entered ticket number.");
                        return false;
                    }
                }else if(flightClass == 2){
                    if(!f.removeEconomy()){
                        JOptionPane.showMessageDialog(null, "No economy passenger found with the entered ticket number.");
                        return false;
                    }
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid flight number entered!");
                    return false;
                }
            }
        }
        return true;
    }
    
    public void showReservations(int flightNumber){
         for (Flight f : flights) {
        if (f.equals(new Flight(flightNumber, 0))) { 
            String reservations = "First-class Passengers:\n";

            // Add First-class passengers
            for (Passenger p : f.getPassengers()) {
                if (p instanceof FirstClass) {
                    reservations += super.toString()+"\n" ;
                }
            }

            reservations += "\nEconomy Passengers:\n";

            // Add Economy passengers
            for (Passenger p : f.getPassengers()) {
                if (p instanceof Economy) {
                    reservations += super.toString() + "\n";
                }
            }

            JOptionPane.showMessageDialog(null, reservations);
            
        }
    }
    JOptionPane.showMessageDialog(null, "No flight with entered number found.");
    
    }
    
    
}