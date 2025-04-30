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
public class Luggage {
    private int numOfBags;
    private double weight;
    
    public Luggage(){
        this.numOfBags = 1;
        this.weight = 25;
        
    }
    
    public Luggage(int numOfBags, double weight){
        this.numOfBags = numOfBags;
        this.weight = weight;
    }
    
    public int getNumOfBags(){
        return this.numOfBags;
    }
    
    public double getWeight(){
        return this.weight;
               
    }
    
    @Override
    public String toString(){
        return this.numOfBags + " bags, "+this.weight+ " kg";
    }
    
    
}
