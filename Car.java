/**
- Create a class called Car.
- The Car class should have a private String field called model.
- The Car class should have a private int field called year.
- The Car class should have a private int field called mileage.
- The Car class should have a private String field called color.

- Should use Vehicle class as a superclass.
- The Car class should have a constructor that accepts parameters for the model, year, mileage, and color. 
- The Car class should have a getters and setters for all fields
 */
public class Car extends Vehicle {
    private int mileage;
    private String color;

    public Car(int year, int mileage, String color, String name, int numPassengers, double price) {
        super(name, numPassengers, year, price, false);
        this.mileage = mileage;
        this.color = color;
    }

    //toString method
    public String toString() {
        return "Model: " + super.getName() + "\nYear: " + super.getYear() + "\nMileage: " + mileage + "\nColor: " + color + "\nNumber of Passengers: " + super.getNumPassengers() + "\nPrice: " + super.getPrice();
    }

 

    //getters
    public int getMileage() {
        return mileage;
    }
    
    public String getColor() {
        return color;
    }
    
    //setters   
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
    
