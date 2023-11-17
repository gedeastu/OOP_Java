public class Methods {

    static void StaticMethod(){
        System.out.println("Hello, Static Methods");
    }

    public void PublicMethod(){
        System.out.println("Hello, Public Methods");
    }

    public void damage(int percentDamage){
        System.out.println("Percent Damage is " + percentDamage);
    }

    public static void main(String[] args) {
        StaticMethod();

        Methods Method = new Methods();
        
        Method.damage(200);
        Method.PublicMethod();
    }
}
