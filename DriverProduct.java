package Persewaan;

import java.util.Scanner;

public class DriverProduct {
    public static void main(String[] args) {
        String choice = "";
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner input = new Scanner(System.in);
     
        System.out.println("CD atau DVD?");
        choice = input.nextLine();

        if (choice.equalsIgnoreCase("CD")) {
            cd.CDprint();

        } else if (choice.equalsIgnoreCase("DVD")) {
            dvd.DVDprint();
        }
        input.close();
        
    }
    
}
