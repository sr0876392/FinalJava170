/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;

/**
 *
 * @author User
 */
public class Reservation  {
//    private String fName;
//    private String lName;
//    private int nights;
//    private double rate;
    
   
    public double getTotalCost(int nights, double rate){
        double total = nights * rate;
        return (total);
    }
    
    public String printMethod (int ID, String fName, String lName, int nights, double rate){
//        this.fName = fName;
//        this.lName = lName;
//        this.nights = nights;
//        this.rate = rate;
        return ("ID: " + ID + ", Name: " + lName + " " + fName + " " + ", Nights: " + nights + ", Rate: $" + rate);
    
    }
    
    
}
