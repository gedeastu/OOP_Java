package Modifiers;

//abstract
abstract class Abstract{
    public String name = "Gede Astu";
    public int age = 19;
    public abstract void house();
}

class Identity extends Abstract {
    public int graduationYear = 2018;
    public void house(){
        System.out.println("From Bali");
    }
}
