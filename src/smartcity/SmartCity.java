/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartcity;

import java.util.Scanner;

/**
 *
 * @author mike
 */
public class SmartCity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sn = new Scanner(System.in);
        System.out.print("HELLO\n");
        Admin a = new Admin();
        a.start();
        boolean play = true;
        while(play){ 
            int n;
           System.out.print("WELCOME TO SMART CITY\nPRESS 1 FOR ADD \nPRESS 2 FOR BOOK \nPRESS 3 TO DISPLY ALL HOTELS\nPRESS 4 TO DISPLY HOTELS BY TOWN\nPRESS 5 TO DISPLY HOTELS BY RANK\n0 TO EXIT");
           n = sn.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.print("You must be an Admin. Enter your sacred number");
                    if(sn.nextInt()==234){
                        a.addHotel();
                    }
                }
                case 2 -> a.aduser();
                case 3 -> a.displayhotels();
                case 4 -> {
                    System.out.print("Please enter the name of the town");
                    a.displayhotelsbytown(sn.next());
                }
                case 5 -> {
                    System.out.print("Please enter the evaluation of the hotels you want");
                    a.displayhotelsbyrank(sn.nextInt());
                }
                case 0 -> play = false;
                default -> {
                    System.out.print("Please enter a correct corresponding number");
                }
            }
        }
        
        
        
        //a.addHotel();
        a.displayhotels();
      // a.displayhotels();
    }
    
}