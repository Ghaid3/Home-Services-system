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
public class Service {
    private String type;
    private String priceRange;
    private String detailes;

    public Service(String type, String priceRange, String detailes) {
        this.type = type;
        this.priceRange = priceRange;
        this.detailes = detailes;
    }
    
    public Service() {}

    public String getType() {
        return type;
    }


    public String getPriceRange() {
        return priceRange;
    }

    public String getDetailes() {
        return detailes;
    }

    
}
