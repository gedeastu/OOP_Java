package SoalTipeA;

public class Boat extends Vehicle {
    private double length;
    
    public Boat(String make, String model, double length){
        super(make, model);
        this.length = length; 
    }

    @Override
    public void start(){
        System.out.println("Starting " + super.getMake() + " " + super.getModel() + " car.");
    }  

    @Override
    public void stop(){
        System.out.println("Stopping " + super.getMake() + " " + super.getModel() + " car.");
    }

    public double getLength(){
        return this.length;
    }

    public void floatOnWater(){
        System.out.println(super.getMake() + " " + super.getModel() + " is floating");
    }
}
