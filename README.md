# Dealership.java

## Set up

1. Have jdk installed
2. Have git installed
3. Clone this repo onto your computer using `git clone [url].git`
4. Start working on assignment

## Complete Motorcylce.java and Dealership.java

### Motorcycle.java

- Reference [Car](./Car.java) and create a class with attributes for a motorcycle that is a subclass of [Vehicle](./Vehicle.java)
  - Attributes
    - the weightcapacity
    - the number of wheels
    - color
    - amount of storage (int)
  - Create constructor with parameters for all fields
  - Create methods
    - Create a toString method that returns a string with all fields
    - Getter and setter method for the amount of storage
    - Getter and setter method for the weightcapacity
    - Getter and setter method for the number of wheels
    - Getter and setter method for the color
    - Getter and setter method for the amount of storage
    - Getter and setter method for the weightcapacity

## Dealership.java

- Fields
  - 3 veichles (can be set to cars or motorcycles)
  - Income (number storing money earned)
- Methods
  - listVehicles methd that prints the models and prices of all the vehicles
  - aboutVehicle methd that prints data about the vehicle, given a vehicle number 1, 2, or 3
  - buyVehicle method that increases income and changes the bought status of the vehicle to true given a vehicle number 1, 2, or 3
