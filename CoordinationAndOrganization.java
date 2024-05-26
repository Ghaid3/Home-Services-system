/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_services_system;

import java.util.logging.Logger;

/**
 *
 * @author Ethar Al Tamimi
 */
public class CoordinationAndOrganization extends Service {
    private String type;
    private String priceRange;
    private String detailes;
    
    public CoordinationAndOrganization(String type, String priceRange, String detailes) {
        super(type, priceRange, detailes);
    }
    public CoordinationAndOrganization(){}
    
     @Override
    public String getDetailes() {
        return "The Coordination and organization service provides different services, \n"
                + "such as party coordination, buffet orgaization and landscaping. \n"
                + "Note: Depending on the time and quantity the price will be determined. \n"; 
    }

    @Override
    public String getPriceRange() {
        return "20-500 OMR";
    }

    @Override
    public String getType() {
        return "Coordination and organization"; 
    }

    @Override
    public String toString() {
        return ("<<<<< "+ this.getType()+" service >>>>> \n"+"The range of price is: "+ this.getPriceRange()
                +"\n"+"More details: "+ this.getDetailes());
    }
    
  
}
