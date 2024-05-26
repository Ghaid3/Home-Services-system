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
public class Maintenance extends Service{
    private String type;
    private String priceRange;
    private String detailes;
    
    public Maintenance(String type, String priceRange, String detailes) {
        super(type, priceRange, detailes);
    }
     
    public Maintenance(){}
    
     @Override
    public String getDetailes() {
        return "The Maintenance service provides different services,\n"
                + "such as plumbring, electrial appliances and mechanical maintenance \n"
                + "Note: Depending on the time and quantity the price will be determined. \n"; 
    }

    @Override
    public String getPriceRange() {
        return "2-100OMR";
    }

    @Override
    public String getType() {
        return "Maintenance"; 
    }

    @Override
    public String toString() {
        return ("<<<<< "+ this.getType()+" service >>>>> \n"+"The range of price is: "+ this.getPriceRange()
                +"\n"+"More details: "+ this.getDetailes());
    }

    
    }
    
