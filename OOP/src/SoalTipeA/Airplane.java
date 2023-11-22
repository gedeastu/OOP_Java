package SoalTipeA;

public class Airplane extends Vehicle implements Flyable{
    private int capacity;
    private String type;

    public Airplane(String make, String model, String type,int capacity){
        super(make, model);
        this.type = type;
        this.capacity = capacity;
    }

    @Override
    public void start(){
        System.out.println("Starting " + super.getMake() + " " + super.getModel() + " car.");
    }

    @Override
    public void stop(){
        System.out.println("Stopping " + super.getMake() + " " + super.getModel() + " car.");
    }

    public int getCapacity(){
        return this.capacity;
    }

    public String getType(){
        return this.type;
    }

    public void fly(){
        System.out.println(super.getMake() + " " + super.getModel() + " is Flying");
    }
}
