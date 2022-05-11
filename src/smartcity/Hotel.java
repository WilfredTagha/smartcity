
package smartcity;

/**
 *
 * @author mike
 */
public class Hotel {
    public String hotel_name;
    public int evaluation;
    public String town;
    public int price;
    public int hnum;
    public int recomendation;
     
    
      Hotel(String hotel_name, int evaluation,  String town, int price, int hnum){
        this.hotel_name = hotel_name;
        this.evaluation = evaluation;
        this.town = town;
        this.price = price;
        this.hnum = hnum;
        
    } 

      
    public void add_recommendation(){
       
        recomendation ++; 
        add_evaluation();
    }
    
    public void add_evaluation(){
         if(this.recomendation>0 && this.recomendation%5==0 && this.evaluation<5){
          evaluation ++;  
         }
        
    }
    
    public void display_hotel(){
        
        System.out.println(hnum + "   " + hotel_name + " " + town + " " + evaluation + " " + price + " " + recomendation);
//        System.out.println(hotel_name);
//        System.out.println(town);
//        System.out.println(evaluation);
//        System.out.println(price);
    }
    
    public String send_name(){
    return this.hotel_name;
    }
    public int send_price(){
    return this.price;
    }
    public int send_recomendation(){
    return this.recomendation;
    }
    
    public int send_num(){
    return this.hnum;
    }
    public String send_town(){
    return this.town;
    }
    public Hotel sendHotel(){
    return this;
    }
   
}