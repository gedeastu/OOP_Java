package SoalTipeA;

class Vehicle {
    String make;
    String model;    

    Vehicle(String make, String model){
        this.make = make;
        this.model = model;
    }

    public String getMake(){
        return this.make;
    }

    public String getModel(){
        return this.model;
    }

    void start(){
        System.out.println("Starting " + this.make + " " + this.model + " " + "car.");
    }
     void stop(){
        System.out.println("Stopping " + this.make + " " + this.model + " " + "car.");
    }
}
