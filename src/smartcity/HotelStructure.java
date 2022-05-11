/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcity;

/**
 *
 * @author Tagha Wilfred
 */
public class HotelStructure {
     public String hotel_name;
    public int evaluation;
    public String town;
    public int price;
    public int hnum;
    public int recomendation;
     
    
      HotelStructure(String hotel_name, int evaluation,  String town, int price, int hnum){
        this.hotel_name = hotel_name;
        this.evaluation = evaluation;
        this.town = town;
        this.price = price;
        this.hnum = hnum;
        
    } 
      HotelStructure(){
      this(" ",0," ",0,0);
      }
      static  Hotel hotels[] = new Hotel[100];
      static User users[] = new User[100];
        
        int numHotels = 0;
       int numUsers = 0;
    
}
