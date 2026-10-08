/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiclerentalapp;

/**
 *
 * @author User
 */
public abstract class Vehicle {
     
     protected String vehicleID;
     protected String brand;
     protected String model;
     protected int year;
     protected int rentalDays;
     public double dailyLife;
     public double insuranceFee;
     public double DriverFee;
     public double HelmetFee;

    public String getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(String vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getRentalDays() {
        return rentalDays;
    }

    public void setRentalDays(int rentalDays) {
        this.rentalDays = rentalDays;
    }

    public double getDailyLife() {
        return dailyLife;
    }

    public void setDailyLife(double dailyLife) {
        this.dailyLife = dailyLife;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }
  
    public Vehicle(String vehicleID, String brand, String model, int year, int rentaldays, String sedan, int par2, double par3) {
        this.vehicleID = vehicleID;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }  
   
    public abstract double calculaterentfee();
    
    
    public void displayVehicleinfo()
    {  
        System.out.println("==========Vehicle Informat==========");
        System.out.println("VehicleID:" + vehicleID);
        System.out.println("Brand:" + brand);
        System.out.println("Model:" + model );
        System.out.println("Year:" + year);
        System.out.println("Rental Days:" + rentalDays);
        System.out.println("Daily Life:" + (double) dailyLife);
        System.out.println("insuranceFee:" + (double) insuranceFee);
        System.out.println("DriverFee:" + (double) DriverFee );
        
        
    }
    
}
    

