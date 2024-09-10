package Persewaan;
//subclass
public class DVD extends Product {

    private int length;
    private String rating;
    private String studio;

    public DVD () {
        number = 10;
        name = "DVD Selamat Siang";
        quantity = 100;
        price = 20000.0;
        length = 60;
        rating = "PG";
        studio = "NewLine";

    } 
    public void DVDprint () {
        System.out.println("Number : " + number);
        System.out.println("Name : " + name);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("Length : " + length + " minutes");
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " + studio);
    }
    
}
