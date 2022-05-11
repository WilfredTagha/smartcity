package smartcity;

import java.util.Scanner;

/**
 *
 * @author mike
 */
public class User {
    String name;
    int budget;
    int unum;
    Hotel hotel;

    User(String name, int budget, int unum) {
       this.name = name;
       this.budget = budget;
       this.unum = unum;
       
    }
    
    public void displayuser(){
    System.out.print(this.name);
    }
 
    
    public void book() {
          Scanner n = new Scanner(System.in);
          Hotel_management ad = new Hotel_management();
          ad.displayHotels();
          System.out.print("Please choose a hotel by writing the sn number\n");
          int num = n.nextInt()-1;
          boolean ans;
          ans = ad.acceptBook(num, this);
          if(ans){
          System.out.print("You have sucessfully booked this hotel");
         }
          else{ System.out.print("You cannot book this hotel\n");
          }
         
          
     
    }
    
}