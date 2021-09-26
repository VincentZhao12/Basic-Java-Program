public class Vehicle   {
    private String name;
    private int numPassengers;
    private int year;
    private double price;
    private boolean bought;
    public static void main(String[] args) {
        
    }
    public Vehicle(String name, int numPassengers, int year, double price, boolean bought) {
        this.name = name;
        this.numPassengers = numPassengers;
        this.year = year;
        this.price = price;
        this.bought = bought;
    }


    public String getName() {
        return name;
    }
    public int getNumPassengers() {
        return numPassengers;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }
    public boolean getBought() {
        return bought;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setBought(boolean bought) {
        this.bought = bought;
    }
    
}
