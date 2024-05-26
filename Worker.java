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
public class Worker extends User{
    
    
    public Worker(String UN, String PW) {
        super(UN, PW);
    }
    
    public boolean Accept(Request r , double price){
        if(!r.getSta().equals("On progress")) {
             r.setSta("On progress");
             r.setPrice(price);
             return true;
        }
        else {
            System.out.println("This service is already on progress with other worker, ");
            System.out.println("Choose another request.");
        } return false;
        
    }
    
    public void complete(Request r){
        DataSave.remove_request(r);
        
    }
       
}
