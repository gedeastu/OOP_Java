package Modifiers;
//Access Modifiers -> public, private, protected
//Non-Access Modifiers -> final, static, abstract, transient, synchronized, and volatile

public class Modifiers {
    //final
    final String name = "Gede Astu Nugraha";

    //static method
    static void Name(){
        System.out.println("Gede Astu Nugraha");
    }

    //public method
    public void Age(int age){
        System.out.println(age);
    }

    public static void main(String[] args) {
        Modifiers obj = new Modifiers();

        //Called by abstract class
        Identity me = new Identity();

        System.out.println("Name : " + me.name);
        System.out.println("Age : " + me.age);
        System.out.println("Graduation Year : " + me.graduationYear);

        

        //Called static
        Name();

        //Called public
        obj.Age(19);

        //final
        // obj.name = "Puspita"; // will generate an error: cannot assign a value to a final variable
        // System.out.println(obj.name);
    }
}