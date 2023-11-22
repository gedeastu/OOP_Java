package SoalTipeA;

public class Helicopter extends Vehicle implements Flyable {

    private int numOfChairs;

    public Helicopter(String make, String model, int numOfChairs){
        super(make,model);
        this.numOfChairs = numOfChairs;
    }

    @Override
    public void start(){
        System.out.println("Starting " + super.getMake() + " " + super.getModel() + " car.");
    }

    @Override
    public void stop(){
        System.out.println("Stopping " + super.getMake() + " " + super.getModel() + " car.");
    }

    public int getNumOfChairs(){
        return this.numOfChairs;
    }

    public void fly(){
        System.out.println(super.getMake() + " " + super.getModel() + " is Flying");
    }

}
