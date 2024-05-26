/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_services_system;

import java.util.Date;

/**
 *
 * @author Ethar Al Tamimi
 */
public class Request {
      String RID;
      Date RDate;
      String Rdesc; // description
      String Sta = "Free"; // stauts
      Service sr;
      double price;

    public Request(String RID, Date RDate, String Rdesc, Service sr) {
        this.RID = RID;
        this.RDate = RDate;
        this.Rdesc = Rdesc;
        this.sr = sr;
    }
      
      
    public String getRID() {
        return RID;
    }

    public Date getRDate() {
        return RDate;
    }

    public String getRdesc() {
        return Rdesc;
    }

    public String getSta() {
        return Sta;
    }

    public void setSta(String Sta) {
        this.Sta = Sta;
    }

    public Service getService() {
        return sr;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void displayComplete() {
        System.out.println();
        System.out.println("This request has been completed with price: "+ getPrice());
        System.out.println("in "+ getRDate());
        
        
    }
    public void infoRequest(){
        System.out.println("The request " + getRID() + " is of type: " + sr.getType());
        
        System.out.println("The description " + getRdesc());
        System.out.println("The date " + getRDate());
        System.out.println("The status " + getSta());
    }
    
    public void displaySummary(){
        if(getSta().equals("On progress")){
            System.out.println("Your request has been accepted, stay tooned");
            System.out.println("The service price is "+ getPrice());
        } else {
            System.out.println("Wait until any worker accept your request");
        }
    }  
      
}
