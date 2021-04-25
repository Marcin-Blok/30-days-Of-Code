package pl.marcinblok.car;

public class Car {
    private final static double AVG_FUEL_CONSUMPTION = 8.5;
    private final static int MAX_PEOPLE_CAPACITY = 5;
    private String brand;
    private int maxSpeed;
    private int currentNumberOfPeople = 1;
    private int tankCapacity;
    private char condition;
    private double fuelConsumption;
    private int currentFuelLevel;

    //Getters
    public String getBrand() {
        return this.brand;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public int getCurrentNumberOfPeople() {
        return this.currentNumberOfPeople;
    }

    public int getTankCapacity() {
        return this.tankCapacity;
    }

    public char getCondition() {
        return condition;
    }

    public double getFuelConsumption() {
        return this.fuelConsumption;
    }
    public int getCurrentFuelLevel(){
        return this.currentFuelLevel;
    }

    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMaxSpeed(int newMaxSpeed) {
        this.maxSpeed = newMaxSpeed;
    }

    public void setCurrentNumberOfPeople() {
        this.currentNumberOfPeople++;
    }

    public void setTankCapacity(int newTankCapacity) {
        this.tankCapacity = newTankCapacity;
    }

    public void setCondition(char newCondition) {
        this.condition = newCondition;
    }

    public void setFuelConsumption(double newFuelConsumption) {
        this.fuelConsumption = newFuelConsumption;
    }

    public void setCurrentFuelLevel(int fuel){
        this.currentFuelLevel = fuel;
    }

    // Instance Methods

    public void getOut(){
        if(getCurrentNumberOfPeople() > 0){
            this.currentNumberOfPeople--;
            System.out.println("One person got out of the car");
        }else{
            System.out.println("The car is empty");
        }
    }

    public void getIn(){
        if(getCurrentNumberOfPeople() >= MAX_PEOPLE_CAPACITY){
            System.out.println("The car is full, there is no room for another passenger");
        }else {
            setCurrentNumberOfPeople();
        }
    }

    public int currentCarMaxDistance(){
        return (int) ((int)getCurrentFuelLevel()/AVG_FUEL_CONSUMPTION * 100);
    }

    public int maxDistance() {
        return (int)(this.tankCapacity /AVG_FUEL_CONSUMPTION * 100);
    }

    public void setCarParameters(String brand, char condition, int maxSpeed, int tankCapacity, double fuelConsumption, int currentFuelLevel) {
        setBrand(brand);
        setCondition(condition);
        setMaxSpeed(maxSpeed);
        setTankCapacity(tankCapacity);
        setFuelConsumption(fuelConsumption);
        setCurrentFuelLevel(currentFuelLevel);
    }

    public void printInfo() {
        System.out.println("Car brand is : " + getBrand());
        System.out.println("Car's condition is: " + getCondition());
        System.out.println("Car's max speed is: " + getMaxSpeed() + "km/h.");
        System.out.println("Car's tank capacity is: " + getTankCapacity());
        System.out.println("Car's fuel consumption is: " + getFuelConsumption() +"l/100km.");
        System.out.println("The number of people in the car: " + getCurrentNumberOfPeople());
        System.out.println("Max distance I could drive with a full tank is: " + maxDistance() + "km.");
        System.out.println("Max distance I can drive-through with current fuel level is: " + currentCarMaxDistance() + "km.\n");
    }

    public void wrecked(){
        System.out.println("Car was wracked");
        this.setCondition('C');
    }

    public static void main(String[] args) {
        Car familyCar = new Car();
        Car myCar = familyCar;
        familyCar.setCarParameters("BMW",'B', 210,40,7,12);
        familyCar.printInfo();
        System.out.println("Passangers get in");
        familyCar.getIn();
        familyCar.getIn();
        familyCar.getIn();
        System.out.println("Current number of people in the car is: " + familyCar.getCurrentNumberOfPeople());
        System.out.println("Passanger get out");
        familyCar.getOut();
        familyCar.printInfo();
        myCar.getIn();
        System.out.println("My car");
        myCar.printInfo();
        myCar.wrecked();
        myCar.printInfo();
    }
}
