/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_services_system;

import java.util.ArrayList;

/**
 *
 * @author iman
 */
public class DataSave {
    
 static ArrayList <Request> Customers_Requests = new ArrayList <Request> ();


 public static Request get_request(int i){
    return Customers_Requests.get(i);
    
}
 
public static void add_request(Request r){
    Customers_Requests.add(r);
    
}

public static void remove_request(Request r){
    Customers_Requests.remove(r);
    
}

public void display() {
     System.out.println("-------------------------------");
     System.out.println("The requests:");
     int num= 1;
    for(int i = 0; i < Customers_Requests.size(); i++){
        System.out.print("Request" + num+ ". ");
        Customers_Requests.get(i).infoRequest();
        num++;
    System.out.println("-----");
    }
    System.out.println("-------------------------------");
}

 
 
 
}
