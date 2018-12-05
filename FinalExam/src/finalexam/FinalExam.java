/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalexam;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class FinalExam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("*** Welcome to our Hotel Reservation System ***");
        ReservationSystem res = new ReservationSystem();
        
//        //добавляет
    //      res.addReservation();
//        // ищет по айди
//        res.findReservationByID();
//        
//        //блок для опции поиска по имени
//        System.out.print("Please enter FIRST name to find the reservation: ");
//        String fName = sc.nextLine();
//        System.out.print("Please enter LAST name to find the reservation: ");
//        String lName = sc.nextLine();

        res.uploadReservations();
        
//        res.addReservation();
//        res.addReservation(2, "KOLIA", "LALA", 5, 5);
//        //показывает все
        res.viewReservations();
         

    }
    
    
}
