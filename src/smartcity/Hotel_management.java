
package smartcity;

import java.util.Scanner;

/**
 *
 * @author mike
 */
public class Hotel_management{

    HotelStructure t = new HotelStructure();
   

   
    public void addHotelProp(String name, String town, int price, int eva) {
         Hotel hotel = new Hotel(name,eva,town,price,t.numHotels+1);
           //System.out.print(i);
          t.hotels[t.numHotels] = hotel;
          t.numHotels++;
    }
    
    
    public User addUser(String name, int budget)  {
              
               User usr = new User(name, budget, t.numUsers+1);
               t.users[t.numUsers] = usr;
               t.numUsers++;
               return usr;
    }
    
    public void displayHotels(){
        

         int i;
         for(i=0; i<t.numHotels; i++)  {
        t.hotels[i].display_hotel();
    }
         
         
         
          }
    
      public void displayHotelsByTown(String u){
        

         int i;
         for(i=0; i<t.numHotels; i++)  {
             if(u.equals(t.hotels[i].town)){
        t.hotels[i].display_hotel();}
    }
         
         
         
          }
      
        public void displayHotelsByRank(int u){
        

         int i;
         for(i=0; i<t.numHotels; i++)  {
             if(u==t.hotels[i].evaluation){
        t.hotels[i].display_hotel(); }
    }
         
         
         
          }
   
    
    public boolean acceptBook(int n, User c) {
        if(t.hotels[n].price<=c.budget){
            
            c.hotel = t.hotels[n];
            t.hotels[n].add_recommendation();
            return true;
        }
        else
            return false;
             
    }
    
    
    }
            
          
