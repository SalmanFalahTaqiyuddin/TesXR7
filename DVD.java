package Persewaan;
//subclass
public class DVD extends Product {

    private int length;
    private String rating;
    private String studio;

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public DVD () {
        super();
        length = 60;
        rating = "PG";
        studio = "NewLine";

    } 
    public DVD (int length, String rating, String studio) {
        
        this.length = length;
        this.rating = rating;
        this.studio = studio;
    }

    @Override
    public void print () {
        super.print();  //To call the print method of the superclass
        System.out.println("Number : " + number);
        System.out.println("Name : " + name);
        System.out.println("Quantity : " + quantity);
        System.out.println("Price : " + price);
        System.out.println("Length : " + length + " minutes");
        System.out.println("Rating : " + rating);
        System.out.println("Studio : " + studio);
    }
    
}
