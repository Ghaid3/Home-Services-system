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
public class Cleaning extends Service{
    private String type;
    private String priceRange;
    private String detailes;
    
    
    public Cleaning(String type, String priceRange, String detailes) {
        super(type, priceRange, detailes);
    }
    
    
    public Cleaning(){}
    
     @Override
    public String getDetailes() {
        return "The cleaning service provides different services, \n"
                + "such as home inside and outside cleaning, company cleaning and cars cleaning. \n"
                + "Note: Depending on the time and quantity the price will be determined. \n"; 
    }

    @Override
    public String getPriceRange() {
        return "3-300OMR";
    }

    @Override
    public String getType() {
        return "Cleaning"; 
    }

    @Override
    public String toString() {
        return ("<<<<< "+ this.getType()+" service >>>>> \n"+"The range of price is: "+ this.getPriceRange()
                +"\n"+"More details: "+ this.getDetailes());
    }


}
