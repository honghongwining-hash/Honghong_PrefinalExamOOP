/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public class VehicleRentalApp {

  
  public static void main(String[] args) {
      
      Vehicle [] vehicles = new Vehicle[3];
      
      vehicles [1] = new Vehicle("SDOO1" , "Toyota" , "Vios", 2024, 3, "Sedan", 5,000.00);
      vehicles [2] = new Vehicle("SDOO1" , "Toyota" , "HiAce", 0223, 2, "Van", 7,000.00);
      vehicles [2] = new Vehicle("SDOO1" , "Honda" , "Click 160", 0224, 4, "motorcycle", 2,600.00);
      
      System.out.println("=======DINA AND GAT RENT SERVICE VEHICLE RENTAL SYSTEM========");
      System.out.println("");
      
      for (Vehicle vehicle: vehicles) {
          Vehicle.displayVehicleInfo()
      }
  }
    
}
