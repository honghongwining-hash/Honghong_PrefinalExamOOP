/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class Van {

    private final double driverFee;
    public Van(String vehicleID, String brand, String model, int year, int rentalDays,
               double dailyRate, double driverFee){ 
    super(vehicleID, brand, model, year, rentalDays);
        this.driverFee = driverFee;
    
        
        
    }
    
     public abstract double calculaterentfee();
    
   public void displayVehicleType()
    {  
        System.out.println("==========Vehicle Informat==========");
        System.out.println("VehicleID:" + vehicleID);
        System.out.println("Brand:" + brand);
        System.out.println("Model:" + model );
        System.out.println("Year:" + year);
        
        
    }
}            