package Persewaan; //nama folder tempat penyimpanan
//subclass
public class CD extends Product{
    private String artist;
    private int totalSong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalSong() {
        return this.totalSong;
    }

    public void setTotalSong(int totalSong) {
        this.totalSong = totalSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }


    
    public CD () {
       super();
        artist = "Salman";
        totalSong = 50;
        label = "Sony Music";
    }

    public CD (String artist, int totalSong, String label) {
        this.artist = artist;
        this.totalSong = totalSong;
        this.label = label;
    }
        
@Override
public void print() {
    super.print(); //untuk manggil method print() di class Product
    System.out.println("Number: " + number);
    System.out.println("Name: " + name);
    System.out.println("Quantity: " + quantity);
    System.out.println("Price: " + price);
    System.out.println("Artist: " + artist);
    System.out.println("Total Song: " + totalSong);
    System.out.println("Label: " + label);

}
   

    }

        


        