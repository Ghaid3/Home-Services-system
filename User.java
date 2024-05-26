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
public class User {
     String UN;
    String PW;

    public User(String UN, String PW) {
        this.UN = UN;
        this.PW = PW;
    }

    public String getUN() {
        return UN;
    }
    
    
    public boolean login(String username, String password){
        if(this.UN.equals(username) && (this.PW.equals(password))){
            return true;
        }
        return false;
        
    }
    
    public boolean login(){
        return true;
    }
    
    
    
}

