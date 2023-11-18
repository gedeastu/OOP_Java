package modifiers;
//Access Modifiers -> public, private, protected
//Non-Access Modifiers -> final, static, abstract, transient, synchronized, and volatile

//abstract
abstract class Abstract{

}

public class Modifiers {
    //final
    final String name = "Gede Astu Nugraha";

    //static
    static void Name(){
        System.out.println("Gede Astu Nugraha");
    }

    public static void main(String[] args) {
        Modifiers obj = new Modifiers();

        //static
        Name();

        //final
        // obj.name = "Puspita"; // will generate an error: cannot assign a value to a final variable
        // System.out.println(obj.name);
    }
}