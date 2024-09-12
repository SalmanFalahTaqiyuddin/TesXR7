package Persewaan;

import java.util.Scanner;

public class Tester1 {
    public static void main(String[] args) {
        String choice = "";
        CD cd = new CD();
        DVD dvd = new DVD();
        Scanner input = new Scanner(System.in);
      
        try{
            System.out.println("Mau membuat berapa objek?");
            int jumlah = input.nextInt();
            System.out.println("Jumlah: " + jumlah);
        } catch (Exception e){
            System.out.println("Tipe data salah");
        }


     
        System.out.println("CD atau DVD?");
        choice = input.next();

        if (choice.equalsIgnoreCase("CD")) {
            cd.print();

        } else if (choice.equalsIgnoreCase("DVD")) {
            dvd.print();
    } else {
        System.out.println("Pilihan yang anda masukkan salah.");
        
    }
        input.close();
        
    }
    
}
