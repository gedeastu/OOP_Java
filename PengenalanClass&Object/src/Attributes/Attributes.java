package Attributes;
public class Attributes {
    public static void main(String[] args) {

        Value Obj = new Value();

        //Modify Attributes
        Obj.Age = 19;

        //Sout Accessing Attributes
        System.out.println(Obj.name);

        //Sout Modify Attributes
        System.out.println(Obj.Age);

        //Make and Sout Multiple Objects
        Value Multiple01 = new Value();
        Value Multiple02 = new Value();
        Multiple02.Personality = "Bad Man";
        System.out.println(Multiple01.Personality);
        System.out.println(Multiple02.Personality);

        System.out.println(Obj.FavoriteChar01 + " and " + Obj.FavoriteChar02);
    }
}


