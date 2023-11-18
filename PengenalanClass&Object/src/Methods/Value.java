package Methods;

public class Value {
    static void StaticMethod(){
        System.out.println("Hello, Static Methods");
    }

    public void PublicMethod(){
        System.out.println("Hello, Public Methods");
    }

    public void damage(int percentDamage){
        System.out.println("Percent Damage is " + percentDamage);
    }
}
