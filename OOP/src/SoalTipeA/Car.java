package SoalTipeA;

public class Car extends Vehicle {
    private int numOfDoors;

    public Car(String make, String model,int numOfDoors){
        super(make,model);
        this.numOfDoors = numOfDoors;
    }
    
    @Override
    public void start(){
        System.out.println("Starting " + super.getMake() + " " + super.getModel() + " car.");
    }

    @Override
    public void stop(){
        System.out.println("Stopping " + super.getMake() + " " + super.getModel() + " car.");
    }

    public int getNumOfDoors(){
        return this.numOfDoors;
    }

    public void openTrunk(){
        System.out.println("Opening trunk of " + super.getMake() + " " + super.getModel());
    }
}