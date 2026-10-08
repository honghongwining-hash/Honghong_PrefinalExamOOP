/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Motorcycle {
    
    public Motorcycle(String vehicleID, String brand, String model, int year, int rentalDays, double dailyRate, double helmetFee) {
        super(vehicleID, brand, model, year, rentalDays);
    }
    public double calculaterentFee() {
        
        return(rentalDays * dailyRate) + helmetFee;
    }
    
}
