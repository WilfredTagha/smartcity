/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcity;

import java.util.Scanner;

/**
 *
 * @author Tagha Wilfred
 */
public class Admin {
    Hotel_management admin = new Hotel_management();
 public void start(){
    admin.addHotelProp("Laliga", "Bamenda", 15000, 2); 
    admin.addHotelProp("Njeforbi", "Buea", 20000, 3); 
    admin.addHotelProp("Landscape", "Tiko", 15000, 2); 
    admin.addHotelProp("Marion", "Bamenda", 18000, 2); 
    admin.addHotelProp("St_Clair", "Buea", 2500, 3); 
    admin.addHotelProp("MountainHotel", "Buea", 40000, 4); 
    admin.addHotelProp("Likumbe", "Baffosam", 25000, 3); 
 }
 public void addHotel(){
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        System.out.print("PLease enter the name, Town, price, and evaluation of the hotel\n");
         String name=sn.next();
         String town=sn.next();
          int price= sn.nextInt();
          int eva=sn.nextInt();
          admin.addHotelProp(name, town, price, eva);            
    } 
 public void aduser(){
  Scanner sn = new Scanner(System.in);
  User a;
               System.out.print("PLease enter the name and budget");
               String nam = sn.next();
               int budget = sn.nextInt();
               a=admin.addUser(nam, budget);
               a.book();
               
 }


 public void displayhotels(){
    System.out.print("SN   NAME     LOCATION      EVALUATION    PRICE\n");
 admin.displayHotels();

 }
 
  public void displayhotelsbyrank(int i){
    System.out.print("SN   NAME     LOCATION      EVALUATION    PRICE\n");
 admin.displayHotelsByRank(i);

 }
  
   public void displayhotelsbytown(String u){
    System.out.print("SN   NAME     LOCATION      EVALUATION    PRICE\n");
 admin.displayHotelsByTown(u);

 }
}
