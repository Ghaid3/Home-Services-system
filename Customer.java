/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_services_system;

/**
 *
 * @author Ethar Al Tamimi
 */
public class Customer extends User {
    
   

    public Customer(String UN, String PW) {
        super(UN, PW);
        
    }
    
    
    public void sendRequest(Request r){
        DataSave.add_request(r);
        System.out.println("Your request has been sent, Thank you for choosing us");
        
    }
       
    
    
    public void  cancel(Request r){
         if(!r.getSta().equals("On progress")) {
             DataSave.remove_request(r);
             System.out.println( "Your request has been cancelled");
             
        }
        else {
            System.out.println("Your request has already accepted by our workers , you can not cancel it");
        }
        
        
        
    
        
    }

        
    
}
