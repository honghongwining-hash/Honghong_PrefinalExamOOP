/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Sedan {
    
    public class Sedan(String vehicleID, String brand, String model, int year, int rentalDays,
                       double dailyRate, double insuranceFee){
    super(vehicleID, "Sedan", model, year, rentalDays);  

}
  
       public double calculationFee() {
           return (rentalDays * dailyRate ) + insuranceFee;
       }
               
}
