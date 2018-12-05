/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;
import java.io.*;
import java.nio.file.*;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class ReservationSystem {
    Scanner sc = new Scanner(System.in);
    public String[] reservationArr = new String[20];
    public int reservationID = 1;
    
    public void addReservation(){
        System.out.println("Enter First Name: ");
        String fName = sc.nextLine();
        System.out.println("Enter Last Name: ");
        String lName = sc.nextLine();
        System.out.println("Enter Nights: ");
        int nights = sc.nextInt();
        System.out.println("Enter Daily Rate: ");
        double rate = sc.nextDouble();
        
        int idx = 0;

        String str = (reservationID + "\t" + fName + "\t" +  lName + "\t" + nights + "\t" + rate);
        if (reservationArr[idx] == null) {
            reservationArr[idx] = str;
            reservationID++;
            idx++;
        }
        else {
            idx++;
        }
    }
    
    public void addReservation(int ID, String fName, String lName, int nights, double rate){
        int id = ID;
        String fname = fName;
        String lname = lName;
        int nightnum = nights;
        double rates = rate;
        String str = (id + "\t" + fname + "\t" +  lname + "\t" + nightnum + "\t" + rates);
        int idx = 0;
        reservationArr[id] = str; 

        

    }
    
    
    public void findReservationByID(){
       // System.out.println(Arrays.toString(reservationArr));
        System.out.println("Please enter reservation ID: ");
        int resID = sc.nextInt();
        Reservation res = new Reservation();
        String foundID = (reservationArr[resID - 1]); 
        String[] holdFields = foundID.split("\t");
                int ID = Integer.parseInt(holdFields[0]);
                String fName = holdFields[1];
                String lName = holdFields[2];
                int nights = Integer.parseInt(holdFields[3]);
                Double rate = Double.parseDouble(holdFields[4]);
                
                System.out.println(res.printMethod(ID, fName, lName, nights, rate));
    }
    
    
    public void findReservationByName(String fName, String lName){
        
        for (String str : reservationArr) {
            if (str != null && str.contains(fName) && str.contains(lName)) {
                Reservation res = new Reservation();
                String[] holdFields = str.split("\t");
                int ID = Integer.parseInt(holdFields[0]);
                String firstName = holdFields[1];
                String lastName = holdFields[2];
                int nights = Integer.parseInt(holdFields[3]);
                Double rate = Double.parseDouble(holdFields[4]);
                
                System.out.println(res.printMethod(ID, firstName, lastName, nights, rate));
            } 
            else if(str != null && !(str.contains(fName) && str.contains(lName))){
                System.out.println("RESERVATION NOT FOUND");
            }
        }
    }
    
    public void viewReservations(){
        Reservation res = new Reservation();
        for (String str : reservationArr) {
            if (str != null) {
                String[] holdFields = str.split("\t");
                int ID = Integer.parseInt(holdFields[0]);
                String fName = holdFields[1];
                String lName = holdFields[2];
                int nights = Integer.parseInt(holdFields[3]);
                Double rate = Double.parseDouble(holdFields[4]);
                
                System.out.println(res.printMethod(ID, fName, lName, nights, rate));

            } 
        }
        System.out.println(Arrays.toString(reservationArr));
         
    }
    
    public void uploadReservations (){
        ReservationSystem res = new ReservationSystem();
        
        // get a path to our file
        Path resPath = Paths.get("reservations.txt");
        // turn it into a file
        File resFile = resPath.toFile();
            try {
                  BufferedReader in = new BufferedReader(
                                      new FileReader(resFile));
                  // read the data from the stream and print it to the console
                  String line = in.readLine();
                  while (line != null) {
                      // split the record into fields
                      String[] holdFields = line.split(" ");
                      int ID = Integer.parseInt(holdFields[0]);
                      String fName = holdFields[1];
                      String lName = holdFields[2];
                      int nights = Integer.parseInt(holdFields[3]);
                      Double rate = Double.parseDouble(holdFields[4]);
                      
                      res.addReservation(ID, fName, lName, nights, rate);
                      
                      //System.out.println(line);
                      line = in.readLine();   
                  }

                  in.close();
              } // end of try
              catch (IOException e) {
                  System.err.println("Caught IOException: " + e.getMessage());
              } // end of catch.
          }
     
    
    
    
    
}



  