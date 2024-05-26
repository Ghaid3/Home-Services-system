/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home_services_system;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Ethar Al Tamimi
 */
public class Home_services_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
       
        //Save all requests in the data save as database
        DataSave allRequests = new DataSave();
        
        // integration objects
        // suppose there are some requests from different customers
        SimpleDateFormat dateFF = new SimpleDateFormat("dd/MM/yyyy");
        Date datee = dateFF.parse("25/12/2022");
        Date date2 = dateFF.parse("28/12/2022");
        Date date3 = dateFF.parse("1/1/2023");
        
        // Create service objects for completeing requests of customers
        Service service2 = new Cleaning();
        Service service3 = new CoordinationAndOrganization();
        Service service4 = new Maintenance();
        // Create service objects for completeing requests of customers
        Customer Customer2 = new Customer( "Saleh" , "ss929292");
        Customer Customer3 = new Customer( "Fatma" , "a12345678");
        Customer Customer4 = new Customer( "Maryam" , "zn123123");
        // Create request object for customers
        Request R2 = new Request("222" , datee , "Need Coordination for birthday party and the location is Saham" , service2 );
        R2.setSta("On progress");
        Request R3 = new Request("223" , date2 , "Request landscaping for my home the location in Seeb" , service3 );
        Request R4 = new Request("224" , datee , "Need Air conditioner maintenance in location Bahla " , service4 );
        Request R5 = new Request("225" , date3 , "Need worker to wash my car in location Nizwa " , service2 );
        // Send Requests by customers and they will be saved in the data save as database
        Customer2.sendRequest(R2);
        Customer2.sendRequest(R3);
        Customer3.sendRequest(R4);
        Customer4.sendRequest(R5);
        // Demo of our System
        // Choose if Customer or Worker 
        System.out.print("Are you Worker(W) or Customer(C): ");
        Scanner input = new Scanner(System.in);
        String user = input.next();

        if (user.equals("W") || user.equals("w")) {
            System.out.print("Enter the username: ");
            Scanner inp = new Scanner(System.in);
            String username = inp.next();

            Scanner inp2 = new Scanner(System.in);
            System.out.print("Enter the password: ");
            String password = inp2.next();

            Worker worker1 = new Worker(username, password);
            allRequests.display();
            boolean flag = false;
            do {
                System.out.print("please choose one( Write the number of it ): ");
                int ReqNum = input.nextInt();
                System.out.print(" Determine your price: ");
                int price = input.nextInt();
                if (worker1.Accept(allRequests.get_request(ReqNum - 1), price)) {
                    System.out.print("Please enter done when you complete your task: ");
                    String Done = input.next();
                    if (Done.equals("Done") || Done.equals("done")) {
                        allRequests.get_request(ReqNum - 1).displayComplete();
                        worker1.complete(allRequests.get_request(ReqNum - 1));
                        break;

                    } else {
                        break;
                    }
                } else {
                    flag = true;
                }
            } while (flag = true);
        } else if (user.equals("C") || user.equals("c")) {

            System.out.print("Enter the username: ");
            Scanner inp = new Scanner(System.in);
            String username = inp.next();

            System.out.print("Enter the password: ");
            Scanner inp2 = new Scanner(System.in);
            String password = inp2.next();
            Customer Customer1 = new Customer(username, password);

            Customer1.login();
            System.out.println("------------------------------------------------------------------");
            System.out.println();
            System.out.println("You are logged in successfully ");
            System.out.println();
            System.out.println(" Welcome " + Customer1.getUN());
            String again;
            do {
                System.out.println("Our service type:  \n 1.cleaing   \n 2.Maintenance \n 3.Coordination and organization");
                System.out.println("\nplease choose one service");

                Scanner input1 = new Scanner(System.in);
                int srviceType = input1.nextInt();

                Service service = null;
                switch (srviceType) {
                    case 1:
                        service = new Cleaning();
                        //print the details
                        System.out.println(service.toString());
                        break;
                    case 2:
                        service = new Maintenance();
                        //print the details
                        System.out.println(service.toString());
                        break;
                    case 3:
                        service = new Maintenance();
                        //print the details
                        System.out.println(service.toString());
                        break;
                    default:
                        break;
                }

                System.out.println("\n\n To complete your request, provide the details with the date ");

                //Read details
                System.out.println("Enter the Details with your location: ");
                Scanner input2 = new Scanner(System.in);
                String details = input2.nextLine();

                //Read date
                System.out.print("Enter date in dd/MM/yyyy format: ");
                Scanner input3 = new Scanner(System.in);
                String dateSring = input3.nextLine();

                // convert the string to date formate
                SimpleDateFormat dateF = new SimpleDateFormat("dd/MM/yyyy");
                Date date = dateF.parse(dateSring);

                // random rid number as string from 100-500
                Random rand = new Random();
                int x = (rand.nextInt(41) + 10) * 10;
                String id = Integer.toString(x);
                //comleate the reqist and send it
                Request R1 = new Request(id, date, details, service);
                Customer1.sendRequest(R1);
                System.out.println("Do you want to sned other request? (Yes/No)");
                Scanner input4 = new Scanner(System.in);
                again = input3.next();

            } while (again.equals("Yes") || again.equals("yes"));
            System.out.println("Thank you for choosing us , wait for our reply soon");

        } else {
            System.out.println("Try Again! ");
        }
    }
    
    }
        
    
    

