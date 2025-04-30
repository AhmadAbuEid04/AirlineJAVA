/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment5;

/**
 *
 * @author ahmad0512
 */
import java.util.*;
import javax.swing.JOptionPane;
public class Assignment5B{

    public static void main(String[] args) {
        Airline airline = new Airline ("JU");       
        
        while(true){
             String operation  = JOptionPane.showInputDialog("What do you want to do?\n1.Add Flight\n2.Remove Flight"
                + "\n3.Operate on Flight\n4.Exit");
            if(operation != null){
                
                
            } 
            switch(operation){
            case "1":
                airline.addFlight();
                break;
            case "2":
                airline.removeFlight();
                break;
                
            case "3":
//                String reservation = "First-class passengers:\n";
//                for(FirstClass passenger : flight.getFirstClassPassengers()){
//                    reservation += passenger.toString() + "\n";
//                }
//                reservation += "Economy Passengers:\n";
//                for (Economy passenger : flight.getEconomyPassengers()) {
//                        reservation += passenger.toString() + "\n";
//                    }
//                JOptionPane.showMessageDialog(null,reservation);
                int flightNum = (Integer)(Integer.parseInt(JOptionPane.showInputDialog("Enter Flight Number:")));
                String op3 = JOptionPane.showInputDialog("Flight#"+flightNum + "--Normal Price: " +"\n"
                        + "1.Make reservation\n2.Cancel reservation\n3.Show all reservations\n4.Exit");
                switch(op3){
                    case "1":
                        if(!airline.reserveFlight(flightNum)){
                           JOptionPane.showMessageDialog(null, "No flight with entered number found."); 
                        }
                        break;
                    case "2":
                        if(!airline.cancelReservation(flightNum)){
                            JOptionPane.showMessageDialog(null, "Cancellation failed");
                        }
                        break;
                    case "3":
                        airline.showReservations(flightNum);
                        break;
                    case "4":
                        JOptionPane.showMessageDialog(null,"Exiting program");
                        break;
                    default:
                       JOptionPane.showMessageDialog(null,"Invalid operation"); 
                }
                break;
            case "4":
                JOptionPane.showMessageDialog(null, "Exiting the program");
                return;   
            default:
                JOptionPane.showMessageDialog(null, "Invalid option. Try again.");
            }
        }
        //k
                
        
    }
}
