package Persewaan; //nama folder tempat penyimpanan
//subclass
public class CD extends Product{
    private String artist;
    private int totalSong;
    private String label;


    
    public CD () {
        number = 10;
        name = "CD Selamat Siang";
        quantity = 100;
        price = 20000.0;
        artist = "Salman";
        totalSong = 50;
        label = "Sony Music";
    }
        
public void CDprint() {
    System.out.println("Number: " + number);
    System.out.println("Name: " + name);
    System.out.println("Quantity: " + quantity);
    System.out.println("Price: " + price);
    System.out.println("Artist: " + artist);
    System.out.println("Total Song: " + totalSong);
    System.out.println("Label: " + label);


    }
}
        


        
